def gasStations(gas, cost):

    gasSum = sum(gas)
    costSum = sum(cost)

    # Total Gas must be greater than Total cost .Only Then it is possible to travel
    if gasSum < costSum:
        return -1

    startStationIndex = 0
    fuel = 0
    gasStationLength = len(gas)

    for i in range(gasStationLength):
        if gas[i] + fuel < cost[i]:
            startStationIndex = i+1
            fuel = 0

        else:
            fuel += (gas[i]-cost[i])

    return startStationIndex


if __name__ == "__main__":

    # Input
    gas = [1, 2, 3, 4, 5]
    cost = [3, 4, 5, 1, 2]


    print(gasStations(gas, cost))