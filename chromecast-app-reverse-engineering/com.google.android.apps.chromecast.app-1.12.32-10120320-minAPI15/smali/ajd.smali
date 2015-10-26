.class public abstract Lajd;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lajf;

.field public c:Z

.field d:I

.field public final e:I

.field private final f:Landroid/os/Handler;

.field private g:Landroid/os/Messenger;

.field private h:I

.field private final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;IIILjava/lang/String;)V
    .locals 1

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 53
    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    iput-object p1, p0, Lajd;->a:Landroid/content/Context;

    .line 54
    const/high16 v0, 0x10000

    iput v0, p0, Lajd;->h:I

    .line 55
    const v0, 0x10001

    iput v0, p0, Lajd;->d:I

    .line 56
    iput-object p5, p0, Lajd;->i:Ljava/lang/String;

    .line 57
    const v0, 0x133060d

    iput v0, p0, Lajd;->e:I

    .line 59
    new-instance v0, Laje;

    invoke-direct {v0, p0}, Laje;-><init>(Lajd;)V

    iput-object v0, p0, Lajd;->f:Landroid/os/Handler;

    .line 65
    return-void
.end method


# virtual methods
.method a(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 150
    iget-boolean v0, p0, Lajd;->c:Z

    if-nez v0, :cond_1

    .line 159
    :cond_0
    :goto_0
    return-void

    .line 153
    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lajd;->c:Z

    .line 155
    iget-object v0, p0, Lajd;->b:Lajf;

    .line 156
    if-eqz v0, :cond_0

    .line 157
    invoke-interface {v0, p1}, Lajf;->a(Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 102
    new-instance v0, Landroid/os/Messenger;

    invoke-direct {v0, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    iput-object v0, p0, Lajd;->g:Landroid/os/Messenger;

    .line 1117
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1118
    const-string v1, "com.facebook.platform.extra.APPLICATION_ID"

    iget-object v2, p0, Lajd;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1122
    iget v1, p0, Lajd;->h:I

    invoke-static {v3, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    .line 1123
    iget v2, p0, Lajd;->e:I

    iput v2, v1, Landroid/os/Message;->arg1:I

    .line 1124
    invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 1125
    new-instance v0, Landroid/os/Messenger;

    iget-object v2, p0, Lajd;->f:Landroid/os/Handler;

    invoke-direct {v0, v2}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 1128
    :try_start_0
    iget-object v0, p0, Lajd;->g:Landroid/os/Messenger;

    invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1131
    :goto_0
    return-void

    .line 1130
    :catch_0
    move-exception v0

    invoke-virtual {p0, v3}, Lajd;->a(Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 107
    iput-object v1, p0, Lajd;->g:Landroid/os/Messenger;

    .line 109
    :try_start_0
    iget-object v0, p0, Lajd;->a:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    :goto_0
    invoke-virtual {p0, v1}, Lajd;->a(Landroid/os/Bundle;)V

    .line 114
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
