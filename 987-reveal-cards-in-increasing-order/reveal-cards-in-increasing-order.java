class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {

        Arrays.sort(deck);

        int n = deck.length;
        int[] ans = new int[n];

        Queue<Integer> q = new LinkedList<>();

        // Store indices
        for (int i = 0; i < n; i++) {
            q.offer(i);
        }

        // Place cards
        for (int i = 0; i < n; i++) {

            int index = q.poll();
            ans[index] = deck[i];

            if (!q.isEmpty()) {
                q.offer(q.poll());
            }
        }

        return ans;
    }
}