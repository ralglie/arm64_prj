SUMMARY = "qt based virtual keyboard"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS:append = " cmake qtbase "
RDEPENDS:${PN}:append = " qtbase "
SRC_URI:append = " file://qtkeyboard "

S = "${WORKDIR}/qtkeyboard"

inherit pkgconfig qt6-cmake

#EXTRA_OECMAKE:append = " --debug-find-pkg=Qt6VirtualKeyboard -DQT_DEBUG_FIND_PACKAGE=ON "
