from asyncore import read


bumList = [
    "brayden",
    "emily",
    "ryan",
    "sam",
    "rory",
    "kennedy",
    "ray",
    "rowhan"
    ]

def bumtest(name):
    for i in range(len(bumList)):
        if name.lower() == bumList[i]:
            return name + " is a bum"
    return name + " is not a bum"

while 1 == 1 :
    print(bumtest(input("enter a name: ")))
