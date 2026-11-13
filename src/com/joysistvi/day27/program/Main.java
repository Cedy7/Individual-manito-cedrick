package com.joysistvi.day27.program;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create an arraylist to store student objects
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(101, "JM", "Malabon", "093456778"));
        employeeList.add(new Employee(102, "Ced", "Rial", "093547932"));
        employeeList.add(new Employee(103, "Aljane", "Romblon", "0965676778"));

        System.out.println("List of Employees: ");
        employeeList.forEach(employee -> System.out.println(employee.getName()));
//        employeeList.forEach(System.out::println);

    }
}

// linkedlist
// [] [] [] [] []
// [] []    [] []
// [] [] [] []

/*
array list
      []   []
  []             []
      []      []
           []
 */

/*
    ArrayList: get data (Default Choice(i.e. ng mga programmer)) | low in memory conception // mabilis kumuha ng data
    LinkedList: add data or delete data

 */