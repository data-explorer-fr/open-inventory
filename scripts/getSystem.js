
importPackage(Packages.com.fasterxml.jackson.databind);
importPackage(Packages.oshi);

si = SystemInfo();
mapper = new ObjectMapper();
obj=JSON.parse(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(si));
print(JSON.stringify(obj))