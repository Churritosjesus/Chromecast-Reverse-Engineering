.class public abstract Lbjq;
.super Lj;
.source "PG"


# instance fields
.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Lj;-><init>()V

    .line 19
    const/4 v0, -0x1

    iput v0, p0, Lbjq;->c:I

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 23
    invoke-super {p0, p1, p2}, Lj;->a(Landroid/view/View;Landroid/os/Bundle;)V

    .line 24
    if-eqz p2, :cond_0

    .line 25
    const-string v0, "currentPercent"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lbjq;->b(I)V

    .line 27
    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 6

    .prologue
    .line 36
    iput p1, p0, Lbjq;->c:I

    .line 37
    invoke-virtual {p0}, Lbjq;->p()Landroid/widget/TextView;

    move-result-object v0

    .line 38
    if-eqz v0, :cond_0

    const/4 v1, -0x1

    if-eq p1, v1, :cond_0

    .line 39
    invoke-virtual {p0}, Lbjq;->e()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lb;->cG:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget v5, p0, Lbjq;->c:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    :cond_0
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 31
    invoke-super {p0, p1}, Lj;->e(Landroid/os/Bundle;)V

    .line 32
    const-string v0, "currentPercent"

    iget v1, p0, Lbjq;->c:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 33
    return-void
.end method

.method protected abstract p()Landroid/widget/TextView;
.end method
