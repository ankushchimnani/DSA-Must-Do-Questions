# Function to Determine will there be no overlap between the time slot or not
def meetingRooms(intervals):
    starts = sorted(start for start, end in intervals)  # Create a list of intervals , Sort by start time
    ends = sorted(end for start, end in intervals)  # Create a list of intervals , Sort by end time

    overlap = 0
    current_max = 0
    i, j = 0, 0

    # Counting How many overlaps are there between the time slots
    while i < len(intervals) and j < len(intervals):

        # If Starts time is less than ends time, That means time slot is valid and can hold a meeting
        if starts[i] >= ends[j]:
            overlap += 1
            j += 1

        # If Starts time is greater than ends time, That means time slot is not valid and can not hold a meeting
        else:
            overlap += 1
            current_max = max(current_max, overlap)
            i += 1

    # Current_max ensuring that one person can attend all meetings. If it is 2 , then it means 2 person needed to complete the attendance in all meetings.
    if current_max == 1:
        return True
    else:
        return False


if __name__ == "__main__":

    # Static Input
    intervals = [[0, 4], [5, 20], [15, 20], [25, 30]]

    print(meetingRooms(intervals))
