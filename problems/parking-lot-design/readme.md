# Parking Lot Design Using OO Design

## Problem statement

### Current Scenario

1. Use cases for this problem.
* Parking can be single-level or multilevel.
* Types of vehicles that can be parked, separate spaces for each type of vehicle.
* Entry and exit points.

2. Constraints
* Number of vehicles that can be accommodated of any type.

3. Basic Design/High-Level Components
* Vehicle/Type of vehicle.
* Entry and Exit points.
* Different spots for vehicles.

4. Bottlenecks
* Capacity breach for any type of vehicle.

5. Scalability
* Scalable from single-level to multi-level
* Scalable from Bike only parking to accommodate all kinds of vehicles.

Keeping these in minds, APIs can be designed in the language of your preference.

```txt
Interesting problem, here is my take on it:

ParkingSlot > Floor > Parking
And separate FareController

So, a Parking can have many Floors and Floor and can have many ParkingSlots. Each Parking Slot is of certain slot size.
Vehicle is the interface type and all Vehicles just have to implement getType method to return type of Vehicle.
There is a separate enum for Slot size, and each slot size has the list of vehicle types it can accommodate. This keeps Parking and Vehicle objects independent of each other.

For calculating Fare, there is a separate FareController class which maintains map of each vehicle parked with details of parking and entry and exit time. Fare for Vehicle type can be kept in Parking and then getFare method can return the final fare on the basis of its inputs which is Parking, entryTime and exitTime.
```

## Solution approach