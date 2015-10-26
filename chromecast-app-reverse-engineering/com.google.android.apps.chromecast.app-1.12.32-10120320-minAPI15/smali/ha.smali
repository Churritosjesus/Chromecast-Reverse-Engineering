.class Lha;
.super Lgz;
.source "PG"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1285
    invoke-direct {p0}, Lgz;-><init>()V

    return-void
.end method


# virtual methods
.method public final g(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 1304
    .line 2040
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    .line 1304
    return v0
.end method

.method public final p(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 1329
    .line 2060
    invoke-virtual {p1}, Landroid/view/View;->getWindowSystemUiVisibility()I

    move-result v0

    .line 1329
    return v0
.end method
