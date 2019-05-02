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
    public List<Integer> subordinates;
}

public class EmployeeImportance {

    public static void main(String[] args) {

        List<Employee> arrayList = new ArrayList();
        int result = getImportance(arrayList, 1);
        System.out.println(result);
    }

    public static int getImportance(List<Employee> employees, int id) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < employees.size(); i++) {
            hashMap.put(employees.get(i).id, employees.get(i));
        }
        return getValueById(hashMap, id);
    }

    public static int getValueById(HashMap<Integer, Employee> hashMap, int id) {
        Employee employee = hashMap.get(id);
        int totalVal = employee.importance;

        for (int i = 0; i < employee.subordinates.size(); i++) {
            int temp = employee.subordinates.get(i);
            totalVal += getValueById(hashMap, temp);
        }
        return totalVal;
    }
}
