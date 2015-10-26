.class Lhb;
.super Lha;
.source "PG"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1338
    invoke-direct {p0}, Lha;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Landroid/view/View;I)V
    .locals 0

    .prologue
    .line 1351
    .line 2058
    invoke-virtual {p1, p2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1352
    return-void
.end method

.method public final u(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 1356
    .line 3034
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    .line 1356
    return v0
.end method

.method public final v(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 1361
    .line 3038
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    .line 1361
    return v0
.end method
