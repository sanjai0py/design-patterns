
## 1. encapsulate the area of change

### encapsulation on method level

```py
def getOrderTotal(order):
    total = 0
    for i in order:
        total += i.price * i.quantity
        if i.country == "IN":
            total *= 0.5
        elif i.country == "US":
            total *= 2.0
    return total
```

we can encapsulate the tax calculation to its own method

```py
def getOrderTotal(order):
    total = 0
    for i in order:
        total += i.price * i.quantity
    total += total * getTax(i.country)
    return total

def getTax(country):
    if country == "IN":
            return 0.5
        elif country == "US":
            return 2.0
```

### encapsulation on class level

## 2. program to an interface not an implementation

## observer pattern
The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically

`publisher + subscriber = observer`

