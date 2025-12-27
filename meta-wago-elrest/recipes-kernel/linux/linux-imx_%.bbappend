FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-change-kernel-config-for-WP400-panels.patch file://0002-add-WP400-panel.patch file://0003-disable-pgc_vpumix.patch file://0004-disable-all-remaining-vpu-power-domains.patch file://0005-change-WP400-defconfig.patch file://0006-add-goodix-i2c-touch-support.patch"

