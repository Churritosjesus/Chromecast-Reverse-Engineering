.class final Lmq;
.super Lnz;
.source "PG"

# interfaces
.implements Lmr;


# instance fields
.field private final c:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 474
    invoke-direct {p0, p2}, Lnz;-><init>(Landroid/content/Context;)V

    .line 475
    iput-object p1, p0, Lmq;->c:Landroid/app/Activity;

    .line 476
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 1

    .prologue
    .line 479
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-nez v0, :cond_1

    .line 480
    const/4 v0, 0x1

    .line 1107
    iput-boolean v0, p0, Lnz;->a:Z

    .line 2197
    :cond_0
    :goto_0
    iput p1, p0, Lnz;->b:F

    .line 2198
    invoke-virtual {p0}, Lnz;->invalidateSelf()V

    .line 485
    return-void

    .line 481
    :cond_1
    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    .line 482
    const/4 v0, 0x0

    .line 2107
    iput-boolean v0, p0, Lnz;->a:Z

    goto :goto_0
.end method

.method final a()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 489
    iget-object v1, p0, Lmq;->c:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lgt;->g(Landroid/view/View;)I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
