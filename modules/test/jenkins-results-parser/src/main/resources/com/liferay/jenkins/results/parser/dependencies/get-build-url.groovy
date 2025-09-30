Map<String, TopLevelItem> topLevelItems = Jenkins.getClassName.getItemMap();

TopLevelItem topLevelItem = topLevelItems.get("${jenkinsJobName}");

for (def build : topLevelItem.getBuilds()) {
	if (build.getQueueId() == ${jenkinsQueueId}) {
		println(Jenkins.getClassName.getRootUrl() + build.getUrl());

		break;
	}
}