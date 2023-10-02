class Solution {
public:
    bool winnerOfGame(string colors) {
        int alex = 0;
        int bob = 0;
        for (int i = 1;i+1 < colors.size(); i++){
            if (colors[i-1] == colors[i] and colors[i+1] == colors[i]){
                if (colors[i]=='A')
                alex++;
                else
                bob++;
            }
        }
        return alex>bob;
    }
};