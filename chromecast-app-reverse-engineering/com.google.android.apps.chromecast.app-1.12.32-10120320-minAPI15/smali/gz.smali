.class Lgz;
.super Lgy;
.source "PG"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1207
    invoke-direct {p0}, Lgy;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 1226
    .line 2046
    invoke-virtual {p1, p2}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1227
    return-void
.end method

.method public final a(Landroid/view/View;Ljava/lang/Runnable;J)V
    .locals 1

    .prologue
    .line 1230
    .line 2050
    invoke-virtual {p1, p2, p3, p4}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    .line 1231
    return-void
.end method

.method public c(Landroid/view/View;I)V
    .locals 1

    .prologue
    .line 1241
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 1242
    const/4 p2, 0x2

    .line 2058
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1245
    return-void
.end method

.method public final c(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 1210
    .line 2029
    invoke-virtual {p1}, Landroid/view/View;->hasTransientState()Z

    move-result v0

    .line 1210
    return v0
.end method

.method public final d(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1218
    .line 2037
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 1219
    return-void
.end method

.method public final e(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 1234
    .line 2054
    invoke-virtual {p1}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v0

    .line 1234
    return v0
.end method

.method public final h(Landroid/view/View;)Landroid/view/ViewParent;
    .locals 1

    .prologue
    .line 1261
    .line 2070
    invoke-virtual {p1}, Landroid/view/View;->getParentForAccessibility()Landroid/view/ViewParent;

    move-result-object v0

    .line 1261
    return-object v0
.end method

.method public final m(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 1266
    .line 2074
    invoke-virtual {p1}, Landroid/view/View;->getMinimumWidth()I

    move-result v0

    .line 1266
    return v0
.end method

.method public final n(Landroid/view/View;)I
    .locals 1

    .prologue
    .line 1271
    .line 2078
    invoke-virtual {p1}, Landroid/view/View;->getMinimumHeight()I

    move-result v0

    .line 1271
    return v0
.end method

.method public q(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 1276
    .line 2082
    invoke-virtual {p1}, Landroid/view/View;->requestFitSystemWindows()V

    .line 1277
    return-void
.end method

.method public final r(Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 1281
    .line 2086
    invoke-virtual {p1}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v0

    .line 1281
    return v0
.end method
