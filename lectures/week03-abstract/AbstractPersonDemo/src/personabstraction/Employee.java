/*
 * The MIT License
 *
 * Copyright 2018 Steven Gordon <s.d.gordon@cqu.edu.au>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package personabstraction;

import java.time.LocalDate;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class Employee extends Person {

    private double salary;
    private LocalDate hireDay;

    public Employee() {
        super();
        this.salary = 0.0;
        this.hireDay = LocalDate.of(2018, 7, 9);
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(2018, 7, 9);

    }

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    /**
     * Get the value of hireDay
     *
     * @return the value of hireDay
     */
    public LocalDate getHireDay() {
        return hireDay;
    }

    /**
     * Set the value of hireDay
     *
     * @param hireDay new value of hireDay
     */
    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }

    /**
     * Set the value of hireDay
     *
     * @param year year of hire
     * @param month month of hire
     * @param day day of hire
     */
    public void setHireDay(int year, int month, int day) {
        this.hireDay = LocalDate.of(year, month, day);
    }

    /**
     * Get the value of salary
     *
     * @return the value of salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Set the value of salary
     *
     * @param salary new value of salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double byPercent) {
        this.salary = this.salary + this.salary * byPercent / 100;
    }

    public String getDescription() {
        return "employee " + super.getName() + " has salary " + this.getSalary();
    }

    @Override
    public String toString() {
        return "Employee{" + "name: " + super.getName() + "; salary: " + salary + "; hireDay:" + hireDay + '}';
    }

}
