/*
 * 5/1/19 3:04 PM : for the current date and time;
 * 2019 : to access the year information of the current date;
 * kirkwang : the currently used username;
 */

package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List subordinates;
}

public class EmployeeImportance {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        Employee employee = new Employee();
        employee.id = 1;
        employee.importance = 5;
        List list = new ArrayList<>();
        list.add(2);
        list.add(3);
        employee.subordinates = list;
        arrayList.add(0, employee);

        employee = new Employee();
        employee.id = 2;
        employee.importance = 3;
        list = new ArrayList<Integer>();
        //    list.add(4);
        //   list.add(5);
        employee.subordinates = list;
        arrayList.add(1, employee);

        employee = new Employee();
        employee.id = 3;
        employee.importance = 3;
        list = new ArrayList<Integer>();
        //   list.add(4);
        //   list.add(5);
        employee.subordinates = list;
        arrayList.add(2, employee);

        int result = getImportance(arrayList, 1);
        System.out.println(result);
    }

    public static int getImportance(List<Employee> employees, int id) {
        HashMap hashMap = new HashMap();
        for (Employee employee : employees) {
            hashMap.put(employee.id, employee);
        }
        return getValueById(hashMap, id);
    }

    public static int getValueById(HashMap<Integer, Employee> hashMap, Object id) {
        Employee employee = hashMap.get(id);
        int totalVal = employee.importance;

        for (int i = 0; i < employee.subordinates.size(); i++) {
            Object temp = employee.subordinates.get(i);
            totalVal += getValueById(hashMap, temp);
        }
        return totalVal;
    }
}
