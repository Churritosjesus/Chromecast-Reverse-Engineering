.class final Lbsc;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbsb;


# direct methods
.method constructor <init>(Lbsb;)V
    .locals 0

    iput-object p1, p0, Lbsc;->a:Lbsb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lbsc;->a:Lbsb;

    invoke-static {v0}, Lbsb;->a(Lbsb;)Lbrb;

    move-result-object v0

    invoke-virtual {v0}, Lbrb;->b()Lcox;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcox;->a(Ljava/lang/Runnable;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lbsc;->a:Lbsb;

    invoke-virtual {v0}, Lbsb;->b()Z

    move-result v0

    iget-object v1, p0, Lbsc;->a:Lbsb;

    const-wide/16 v2, 0x0

    invoke-static {v1, v2, v3}, Lbsb;->a(Lbsb;J)J

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbsc;->a:Lbsb;

    invoke-static {v0}, Lbsb;->b(Lbsb;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbsc;->a:Lbsb;

    invoke-virtual {v0}, Lbsb;->a()V

    goto :goto_0
.end method
