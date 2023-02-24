LINUX_VERSION = "5.10"
KBRANCH="feature/xilinx-2021.1-allegro-dvt-upstream-driver"
SRCREV = "34457c35242118c17eec867f217f778c9726902a"

KCONF_AUDIT_LEVEL="0"

include linux-xlnx.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
