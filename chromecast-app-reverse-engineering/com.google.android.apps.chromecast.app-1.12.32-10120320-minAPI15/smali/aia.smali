.class public final Laia;
.super Landroid/content/BroadcastReceiver;
.source "PG"


# static fields
.field private static a:Laia;


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 49
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Laia;->b:Landroid/content/Context;

    .line 50
    return-void
.end method

.method public static a(Landroid/content/Context;)Laia;
    .locals 4

    .prologue
    .line 66
    sget-object v0, Laia;->a:Laia;

    if-eqz v0, :cond_0

    .line 67
    sget-object v0, Laia;->a:Laia;

    .line 71
    :goto_0
    return-object v0

    .line 69
    :cond_0
    new-instance v0, Laia;

    invoke-direct {v0, p0}, Laia;-><init>(Landroid/content/Context;)V

    .line 70
    sput-object v0, Laia;->a:Laia;

    .line 1053
    iget-object v1, v0, Laia;->b:Landroid/content/Context;

    .line 1054
    invoke-static {v1}, Lbk;->a(Landroid/content/Context;)Lbk;

    move-result-object v1

    .line 1055
    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.parse.bolts.measurement_event"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Lbk;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 71
    sget-object v0, Laia;->a:Laia;

    goto :goto_0
.end method


# virtual methods
.method protected final finalize()V
    .locals 11

    .prologue
    const/4 v5, 0x0

    .line 76
    .line 1060
    :try_start_0
    iget-object v0, p0, Laia;->b:Landroid/content/Context;

    .line 1061
    invoke-static {v0}, Lbk;->a(Landroid/content/Context;)Lbk;

    move-result-object v8

    .line 1164
    iget-object v9, v8, Lbk;->a:Ljava/util/HashMap;

    monitor-enter v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 1165
    :try_start_1
    iget-object v0, v8, Lbk;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 1166
    if-nez v0, :cond_0

    .line 1167
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    :goto_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 79
    return-void

    :cond_0
    move v7, v5

    .line 1169
    :goto_1
    :try_start_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v7, v1, :cond_4

    .line 1170
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/IntentFilter;

    move v6, v5

    .line 1171
    :goto_2
    invoke-virtual {v1}, Landroid/content/IntentFilter;->countActions()I

    move-result v2

    if-ge v6, v2, :cond_3

    .line 1172
    invoke-virtual {v1, v6}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;

    move-result-object v10

    .line 1173
    iget-object v2, v8, Lbk;->b:Ljava/util/HashMap;

    invoke-virtual {v2, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    .line 1174
    if-eqz v2, :cond_2

    move v4, v5

    .line 1175
    :goto_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v4, v3, :cond_1

    .line 1176
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbn;

    iget-object v3, v3, Lbn;->b:Landroid/content/BroadcastReceiver;

    if-ne v3, p0, :cond_5

    .line 1177
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1178
    add-int/lit8 v3, v4, -0x1

    .line 1175
    :goto_4
    add-int/lit8 v4, v3, 0x1

    goto :goto_3

    .line 1181
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gtz v2, :cond_2

    .line 1182
    iget-object v2, v8, Lbk;->b:Ljava/util/HashMap;

    invoke-virtual {v2, v10}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1171
    :cond_2
    add-int/lit8 v2, v6, 0x1

    move v6, v2

    goto :goto_2

    .line 1169
    :cond_3
    add-int/lit8 v1, v7, 0x1

    move v7, v1

    goto :goto_1

    .line 1187
    :cond_4
    monitor-exit v9

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 78
    :catchall_1
    move-exception v0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    throw v0

    :cond_5
    move v3, v4

    goto :goto_4
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    .prologue
    .line 84
    invoke-static {p1}, Lahe;->a(Landroid/content/Context;)Lahe;

    move-result-object v2

    .line 85
    const-string v0, "bf_"

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v0, "event_name"

    .line 86
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 87
    :goto_0
    const-string v0, "event_args"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v3

    .line 88
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 89
    invoke-virtual {v3}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 90
    const-string v6, "[^0-9a-zA-Z _-]"

    const-string v7, "-"

    invoke-virtual {v0, v6, v7}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "^[ -]*"

    const-string v8, ""

    .line 91
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "[ -]*$"

    const-string v8, ""

    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 92
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v6, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 86
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v1, v0

    goto :goto_0

    .line 94
    :cond_1
    invoke-virtual {v2, v1, v4}, Lahe;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 95
    return-void
.end method
