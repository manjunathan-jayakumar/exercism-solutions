class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder label = new StringBuilder();
        if (id != null){ label.append("[" + id + "] - "); }
        label.append(name + " - ");
        if(department != null) { label.append(department.toUpperCase()); }
        else { label.append("OWNER"); }

        return label.toString();
    }
}
