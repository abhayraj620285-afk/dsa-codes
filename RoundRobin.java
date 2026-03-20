import java .util.*;
    class RoundRobin {
        public static void main(String[] args) {
            int n = 4; // number of processes
            int[] burstTime = {5, 15, 4, 3};
            int[] remainingTime = new int[n];
            int[] waitingTime = new int[n];
            int[] turnaroundTime = new int[n];

            int timeQuantum = 3;

            // Copy burst time to remaining time
            for (int i = 0; i < n; i++) {
                remainingTime[i] = burstTime[i];
            }

            int time = 0;

            while (true) {
                boolean done = true;

                for (int i = 0; i < n; i++) {
                    if (remainingTime[i] > 0) {
                        done = false;

                        if (remainingTime[i] > timeQuantum) {
                            time += timeQuantum;
                            remainingTime[i] -= timeQuantum;
                        } else {
                            time += remainingTime[i];
                            waitingTime[i] = time - burstTime[i];
                            remainingTime[i] = 0;
                        }
                    }
                }

                if (done) break;
            }

            // Calculate turnaround time
            for (int i = 0; i < n; i++) {
                turnaroundTime[i] = burstTime[i] + waitingTime[i];
            }

            // Print results
            System.out.println("Process\tBT\tWT\tTAT");
            for (int i = 0; i < n; i++) {
                System.out.println("P" + (i + 1) + "\t" +
                        burstTime[i] + "\t" +
                        waitingTime[i] + "\t" +
                        turnaroundTime[i]);
            }
        }
    }

