.class final Lavo;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lawc;


# instance fields
.field private synthetic a:Lavm;


# direct methods
.method constructor <init>(Lavm;)V
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lavo;->a:Lavm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 120
    iget-object v0, p0, Lavo;->a:Lavm;

    .line 2013
    iget-object v0, v0, Lavm;->b:Landroid/os/Handler;

    .line 120
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 121
    return-void
.end method

.method public final a([B)V
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lavo;->a:Lavm;

    .line 1013
    invoke-virtual {v0, p1}, Lavm;->a([B)V

    .line 116
    return-void
.end method
