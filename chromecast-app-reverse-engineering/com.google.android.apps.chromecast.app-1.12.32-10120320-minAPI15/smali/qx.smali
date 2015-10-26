.class public final Lqx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Liu;


# instance fields
.field private a:Z

.field private b:I

.field private synthetic c:Lqw;


# direct methods
.method protected constructor <init>(Lqw;)V
    .locals 1

    .prologue
    .line 255
    iput-object p1, p0, Lqx;->c:Lqw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 256
    const/4 v0, 0x0

    iput-boolean v0, p0, Lqx;->a:Z

    return-void
.end method


# virtual methods
.method public final a(Lih;I)Lqx;
    .locals 1

    .prologue
    .line 261
    iget-object v0, p0, Lqx;->c:Lqw;

    iput-object p1, v0, Lqw;->f:Lih;

    .line 262
    iput p2, p0, Lqx;->b:I

    .line 263
    return-object p0
.end method

.method public final a(Landroid/view/View;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 268
    iget-object v0, p0, Lqx;->c:Lqw;

    invoke-virtual {v0, v1}, Lqw;->setVisibility(I)V

    .line 269
    iput-boolean v1, p0, Lqx;->a:Z

    .line 270
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 274
    iget-boolean v0, p0, Lqx;->a:Z

    if-eqz v0, :cond_0

    .line 281
    :goto_0
    return-void

    .line 276
    :cond_0
    iget-object v0, p0, Lqx;->c:Lqw;

    const/4 v1, 0x0

    iput-object v1, v0, Lqw;->f:Lih;

    .line 277
    iget-object v0, p0, Lqx;->c:Lqw;

    iget v1, p0, Lqx;->b:I

    invoke-virtual {v0, v1}, Lqw;->setVisibility(I)V

    .line 278
    iget-object v0, p0, Lqx;->c:Lqw;

    iget-object v0, v0, Lqw;->d:Landroid/view/ViewGroup;

    goto :goto_0
.end method

.method public final c(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 285
    const/4 v0, 0x1

    iput-boolean v0, p0, Lqx;->a:Z

    .line 286
    return-void
.end method
