.class final Lavt;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lavv;


# instance fields
.field private synthetic a:Lavs;


# direct methods
.method constructor <init>(Lavs;)V
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lavt;->a:Lavs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 40
    iget-object v0, p0, Lavt;->a:Lavs;

    .line 2014
    iget-object v0, v0, Lavs;->b:Landroid/os/Handler;

    .line 40
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 41
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 35
    iget-object v0, p0, Lavt;->a:Lavs;

    .line 1014
    iget-object v0, v0, Lavs;->b:Landroid/os/Handler;

    .line 35
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 36
    return-void
.end method
