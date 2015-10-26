.class final Lbjf;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Lbje;


# direct methods
.method constructor <init>(Lbje;)V
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lbjf;->a:Lbje;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 31
    .line 3036
    iget-object v0, p0, Lbjf;->a:Lbje;

    .line 4012
    iget-boolean v0, v0, Lbje;->e:Z

    .line 3036
    if-eqz v0, :cond_0

    .line 3037
    iget-object v0, p0, Lbjf;->a:Lbje;

    .line 5012
    iget-object v0, v0, Lbje;->a:Landroid/os/Handler;

    .line 3037
    iget-object v1, p0, Lbjf;->a:Lbje;

    .line 6012
    iget-object v1, v1, Lbje;->b:Ljava/lang/Runnable;

    .line 3037
    const-wide/16 v2, 0x708

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 31
    :cond_0
    return-void
.end method

.method public final b_(I)V
    .locals 4

    .prologue
    .line 43
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    .line 44
    iget-object v0, p0, Lbjf;->a:Lbje;

    .line 1012
    iget-boolean v0, v0, Lbje;->e:Z

    .line 44
    if-eqz v0, :cond_0

    .line 45
    iget-object v0, p0, Lbjf;->a:Lbje;

    .line 2012
    iget-object v0, v0, Lbje;->a:Landroid/os/Handler;

    .line 45
    iget-object v1, p0, Lbjf;->a:Lbje;

    .line 3012
    iget-object v1, v1, Lbje;->b:Ljava/lang/Runnable;

    .line 45
    const-wide/16 v2, 0x708

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 47
    :cond_0
    return-void
.end method
