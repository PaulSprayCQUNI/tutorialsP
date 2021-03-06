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
package w2vehicle;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class VehicleTester {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        
        
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Vehicle();
        vehicles[1] = new Car();
        vehicles[2] = new Vehicle("Ford", "Aug2015", 7.4);
        vehicles[3] = new Car("Toyota", "Jun1956", 13.6, 5);
        
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
     }
    
}
