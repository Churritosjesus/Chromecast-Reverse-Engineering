.class Ljj;
.super Lji;
.source "PG"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1073
    invoke-direct {p0}, Lji;-><init>()V

    return-void
.end method


# virtual methods
.method public final t(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1077
    .line 2028
    check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getViewIdResourceName()Ljava/lang/String;

    move-result-object v0

    .line 1077
    return-object v0
.end method
