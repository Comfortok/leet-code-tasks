class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int hours = 0;
        int totalEnergy = 0;
        for (int i = 0; i < energy.length; i++) {
            totalEnergy += energy[i];

            if (experience[i] >= initialExperience) {
                while (initialExperience <= experience[i]) {
                    initialExperience++;
                    hours++;
                }
            }
            initialExperience += experience[i];
        }
        return hours + (totalEnergy - initialEnergy >= 0 ? totalEnergy - initialEnergy + 1 : 0);
    }
}