class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email : emails) {
            String[] splitEmail = email.split("@");
            String localName = splitEmail[0].replaceAll("\\.", "");
            if (localName.contains("+")) {
                localName = localName.substring(0, localName.indexOf("+"));
            }
            String domainName = splitEmail[1];
            String emailAddress = localName.concat("@").concat(domainName);
            uniqueEmails.add(emailAddress);
        }

        return uniqueEmails.size();
    }
}