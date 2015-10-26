.class public final Ljt;
.super Landroid/view/accessibility/AccessibilityNodeProvider;
.source "PG"


# instance fields
.field private synthetic a:Lju;


# direct methods
.method public constructor <init>(Lju;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Ljt;->a:Lju;

    invoke-direct {p0}, Landroid/view/accessibility/AccessibilityNodeProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Ljt;->a:Lju;

    invoke-interface {v0, p1}, Lju;->a(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo;

    return-object v0
.end method

.method public final findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Ljt;->a:Lju;

    invoke-interface {v0, p1, p2}, Lju;->a(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final performAction(IILandroid/os/Bundle;)Z
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Ljt;->a:Lju;

    invoke-interface {v0, p1, p2, p3}, Lju;->a(IILandroid/os/Bundle;)Z

    move-result v0

    return v0
.end method
