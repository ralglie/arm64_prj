SUMMARY = "A recipe to demonsrate how to integrate Qt6 applications using Yocto Project"
LICENSE = "CLOSED"
DEPENDS:append = " cmake qtbase qtdeclarative qtdeclarative-native qtwebengine libmsgtool"
RDEPENDS:${PN}:append = " qtbase qtdeclarative qtwebengine libmsgtool"
SRC_URI:append = " file://webenginebrowser"

S = "${WORKDIR}/webenginebrowser"

inherit pkgconfig qt6-cmake

EXTRA_OECMAKE:append = " --debug-find-pkg=Qt6Quick -DQT_DEBUG_FIND_PACKAGE=ON "
