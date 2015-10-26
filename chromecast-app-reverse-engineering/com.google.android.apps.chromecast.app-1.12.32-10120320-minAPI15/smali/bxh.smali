.class public abstract Lbxh;
.super Ljava/lang/Object;

# interfaces
.implements Lbwg;


# instance fields
.field private synthetic a:Lbwz;


# direct methods
.method public constructor <init>(Lbwz;)V
    .locals 0

    iput-object p1, p0, Lbxh;->a:Lbwz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    .prologue
    .line 0
    iget-object v0, p0, Lbxh;->a:Lbwz;

    invoke-static {v0}, Lbwz;->b(Lbwz;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v0, p0, Lbxh;->a:Lbwz;

    invoke-static {v0}, Lbwz;->a(Lbwz;)Lbxj;

    move-result-object v0

    instance-of v0, v0, Lbwy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbxh;->a:Lbwz;

    invoke-static {v0}, Lbwz;->b(Lbwz;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    :goto_0
    return-void

    :cond_0
    packed-switch p1, :pswitch_data_0

    :goto_1
    iget-object v0, p0, Lbxh;->a:Lbwz;

    invoke-static {v0}, Lbwz;->b(Lbwz;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :pswitch_0
    :try_start_1
    iget-object v0, p0, Lbxh;->a:Lbwz;

    invoke-static {v0, p1}, Lbwz;->a(Lbwz;I)V

    iget-object v0, p0, Lbxh;->a:Lbwz;

    invoke-virtual {v0}, Lbwz;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lbxh;->a:Lbwz;

    invoke-static {v1}, Lbwz;->b(Lbwz;)Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0

    :pswitch_1
    :try_start_2
    iget-object v0, p0, Lbxh;->a:Lbwz;

    .line 1000
    iget-boolean v0, v0, Lbwz;->g:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lbxh;->a:Lbwz;

    invoke-static {v0}, Lbwz;->b(Lbwz;)Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :cond_1
    :try_start_3
    iget-object v0, p0, Lbxh;->a:Lbwz;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lbwz;->a(Lbwz;Z)Z

    iget-object v0, p0, Lbxh;->a:Lbwz;

    iget-object v0, v0, Lbwz;->i:Landroid/content/BroadcastReceiver;

    if-nez v0, :cond_2

    iget-object v0, p0, Lbxh;->a:Lbwz;

    new-instance v1, Lbxf;

    iget-object v2, p0, Lbxh;->a:Lbwz;

    invoke-direct {v1, v2}, Lbxf;-><init>(Lbwz;)V

    iput-object v1, v0, Lbwz;->i:Landroid/content/BroadcastReceiver;

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.intent.action.PACKAGE_ADDED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v1, "package"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    iget-object v1, p0, Lbxh;->a:Lbwz;

    invoke-static {v1}, Lbwz;->c(Lbwz;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lbxh;->a:Lbwz;

    iget-object v2, v2, Lbwz;->i:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_2
    iget-object v0, p0, Lbxh;->a:Lbwz;

    iget-object v0, v0, Lbwz;->h:Lbxe;

    iget-object v1, p0, Lbxh;->a:Lbwz;

    iget-object v1, v1, Lbwz;->h:Lbxe;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lbxe;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    iget-object v2, p0, Lbxh;->a:Lbwz;

    invoke-static {v2}, Lbwz;->d(Lbwz;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lbxe;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object v0, p0, Lbxh;->a:Lbwz;

    iget-object v0, v0, Lbwz;->h:Lbxe;

    iget-object v1, p0, Lbxh;->a:Lbwz;

    iget-object v1, v1, Lbwz;->h:Lbxe;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lbxe;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    iget-object v2, p0, Lbxh;->a:Lbwz;

    invoke-static {v2}, Lbwz;->e(Lbwz;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lbxe;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object v0, p0, Lbxh;->a:Lbwz;

    invoke-static {v0, p1}, Lbwz;->a(Lbwz;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
