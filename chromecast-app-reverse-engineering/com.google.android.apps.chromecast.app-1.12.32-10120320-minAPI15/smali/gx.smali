.class Lgx;
.super Lgw;
.source "PG"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 973
    invoke-direct {p0}, Lgw;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(III)I
    .locals 1

    .prologue
    .line 1000
    .line 2041
    invoke-static {p1, p2, p3}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    .line 1000
    return v0
.end method

.method final a()J
    .locals 2

    .prologue
    .line 2025
    invoke-static {}, Landroid/animation/ValueAnimator;->getFrameDelay()J

    move-result-wide v0

    .line 976
    return-wide v0
.end method

.method public final a(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 1024
    .line 2093
    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationX(F)V

    .line 1025
    return-void
.end method

.method public final a(Landroid/view/View;ILandroid/graphics/Paint;)V
    .locals 0

    .prologue
    .line 984
    .line 2033
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 985
    return-void
.end method

.method public final a(Landroid/view/View;Z)V
    .locals 0

    .prologue
    .line 1120
    .line 2153
    invoke-virtual {p1, p2}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 1121
    return-void
.end method

.method public final b(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 1028
    .line 2097
    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    .line 1029
    return-void
.end method

.method public final b(Landroid/view/View;Z)V
    .locals 0

    .prologue
    .line 1125
    .line 2157
    invoke-virtual {p1, p2}, Landroid/view/View;->setActivated(Z)V

    .line 1126
    return-void
.end method

.method public final c(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 1032
    .line 2101
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 1033
    return-void
.end method

.method public final d(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 1056
    .line 2125
    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleX(F)V

    .line 1057
    return-void
.end method

.method public final e(Landroid/view/View;F)V
    .locals 0

    .prologue
    .line 1060
    .line 2129
    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleY(F)V

    .line 1061
    return-void
.end method

.method public final f(Landroid/view/View;)F
    .locals 1

    .prologue
    .line 980
    .line 2029
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    move-result v0

    .line 980
    return v0
.end method

.method public final i(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 1004
    .line 2045
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidthAndState()I

    move-result v0

    .line 1004
    return v0
.end method

.method public final j(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 1012
    .line 2053
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredState()I

    move-result v0

    .line 1012
    return v0
.end method

.method public final k(Landroid/view/View;)F
    .locals 1

    .prologue
    .line 1016
    .line 2057
    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result v0

    .line 1016
    return v0
.end method

.method public final l(Landroid/view/View;)F
    .locals 1

    .prologue
    .line 1020
    .line 2061
    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result v0

    .line 1020
    return v0
.end method

.method public final s(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1115
    .line 2149
    invoke-virtual {p1}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 1116
    return-void
.end method
