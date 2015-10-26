.class final Lawf;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lavv;


# instance fields
.field private synthetic a:Lawe;


# direct methods
.method constructor <init>(Lawe;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lawf;->a:Lawe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 60
    iget-object v0, p0, Lawf;->a:Lawe;

    .line 2016
    iget-object v0, v0, Lawe;->a:Landroid/os/Handler;

    .line 60
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 61
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 55
    iget-object v0, p0, Lawf;->a:Lawe;

    .line 1016
    iget-object v0, v0, Lawe;->a:Landroid/os/Handler;

    .line 55
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 56
    return-void
.end method
