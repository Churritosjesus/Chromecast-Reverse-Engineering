.class final Lavn;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lavv;


# instance fields
.field private synthetic a:Lavm;


# direct methods
.method constructor <init>(Lavm;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lavn;->a:Lavm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 92
    iget-object v0, p0, Lavn;->a:Lavm;

    .line 2013
    iget-object v0, v0, Lavm;->b:Landroid/os/Handler;

    .line 92
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 93
    return-void
.end method

.method public final b()V
    .locals 4

    .prologue
    .line 87
    iget-object v0, p0, Lavn;->a:Lavm;

    .line 1110
    new-instance v1, Lawb;

    iget-object v2, v0, Lavm;->c:Ljava/util/UUID;

    new-instance v3, Lavo;

    invoke-direct {v3, v0}, Lavo;-><init>(Lavm;)V

    invoke-direct {v1, v2, v3}, Lawb;-><init>(Ljava/util/UUID;Lawc;)V

    .line 1123
    iget-object v0, v0, Lavm;->a:Lauv;

    invoke-virtual {v0, v1}, Lauv;->a(Lavr;)V

    .line 88
    return-void
.end method
