.class public final Lbk;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final f:Ljava/lang/Object;

.field private static g:Lbk;


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Ljava/util/HashMap;

.field private final c:Landroid/content/Context;

.field private final d:Ljava/util/ArrayList;

.field private final e:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 96
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lbk;->f:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbk;->a:Ljava/util/HashMap;

    .line 86
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbk;->b:Ljava/util/HashMap;

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lbk;->d:Ljava/util/ArrayList;

    .line 109
    iput-object p1, p0, Lbk;->c:Landroid/content/Context;

    .line 110
    new-instance v0, Lbl;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lbl;-><init>(Lbk;Landroid/os/Looper;)V

    iput-object v0, p0, Lbk;->e:Landroid/os/Handler;

    .line 123
    return-void
.end method

.method public static a(Landroid/content/Context;)Lbk;
    .locals 3

    .prologue
    .line 100
    sget-object v1, Lbk;->f:Ljava/lang/Object;

    monitor-enter v1

    .line 101
    :try_start_0
    sget-object v0, Lbk;->g:Lbk;

    if-nez v0, :cond_0

    .line 102
    new-instance v0, Lbk;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lbk;-><init>(Landroid/content/Context;)V

    sput-object v0, Lbk;->g:Lbk;

    .line 104
    :cond_0
    sget-object v0, Lbk;->g:Lbk;

    monitor-exit v1

    return-object v0

    .line 105
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic a(Lbk;)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    .line 46
    .line 1285
    :cond_0
    iget-object v1, p0, Lbk;->a:Ljava/util/HashMap;

    monitor-enter v1

    .line 1286
    :try_start_0
    iget-object v0, p0, Lbk;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 1287
    if-gtz v0, :cond_1

    .line 1288
    monitor-exit v1

    return-void

    .line 1290
    :cond_1
    new-array v4, v0, [Lbm;

    .line 1291
    iget-object v0, p0, Lbk;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1292
    iget-object v0, p0, Lbk;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1293
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v3, v2

    .line 1294
    :goto_0
    array-length v0, v4

    if-ge v3, v0, :cond_0

    .line 1295
    aget-object v5, v4, v3

    move v1, v2

    .line 1296
    :goto_1
    iget-object v0, v5, Lbm;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 1297
    iget-object v0, v5, Lbm;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbn;

    iget-object v0, v0, Lbn;->b:Landroid/content/BroadcastReceiver;

    iget-object v6, p0, Lbk;->c:Landroid/content/Context;

    iget-object v7, v5, Lbm;->a:Landroid/content/Intent;

    invoke-virtual {v0, v6, v7}, Landroid/content/BroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 1296
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 1293
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 1294
    :cond_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    .locals 6

    .prologue
    .line 134
    iget-object v2, p0, Lbk;->a:Ljava/util/HashMap;

    monitor-enter v2

    .line 135
    :try_start_0
    new-instance v3, Lbn;

    invoke-direct {v3, p2, p1}, Lbn;-><init>(Landroid/content/IntentFilter;Landroid/content/BroadcastReceiver;)V

    .line 136
    iget-object v0, p0, Lbk;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 137
    if-nez v0, :cond_0

    .line 138
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 139
    iget-object v1, p0, Lbk;->a:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    :cond_0
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p2}, Landroid/content/IntentFilter;->countActions()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 143
    invoke-virtual {p2, v1}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;

    move-result-object v4

    .line 144
    iget-object v0, p0, Lbk;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 145
    if-nez v0, :cond_1

    .line 146
    new-instance v0, Ljava/util/ArrayList;

    const/4 v5, 0x1

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 147
    iget-object v5, p0, Lbk;->b:Ljava/util/HashMap;

    invoke-virtual {v5, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    :cond_1
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 151
    :cond_2
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Landroid/content/Intent;)Z
    .locals 15

    .prologue
    .line 201
    iget-object v13, p0, Lbk;->a:Ljava/util/HashMap;

    monitor-enter v13

    .line 202
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 203
    iget-object v1, p0, Lbk;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->resolveTypeIfNeeded(Landroid/content/ContentResolver;)Ljava/lang/String;

    move-result-object v3

    .line 205
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v5

    .line 206
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    move-result-object v4

    .line 207
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getCategories()Ljava/util/Set;

    move-result-object v6

    .line 209
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getFlags()I

    move-result v1

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    move v12, v1

    .line 211
    :goto_0
    if-eqz v12, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v7, "Resolving type "

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v7, " scheme "

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v7, " of intent "

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v0, p1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 215
    :cond_0
    iget-object v1, p0, Lbk;->b:Ljava/util/HashMap;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Ljava/util/ArrayList;

    move-object v8, v0

    .line 216
    if-eqz v8, :cond_b

    .line 217
    if-eqz v12, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v7, "Action list: "

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 219
    :cond_1
    const/4 v10, 0x0

    .line 220
    const/4 v1, 0x0

    move v11, v1

    :goto_1
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v11, v1, :cond_8

    .line 221
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Lbn;

    move-object v9, v0

    .line 222
    if-eqz v12, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v7, "Matching against filter "

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v9, Lbn;->a:Landroid/content/IntentFilter;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    :cond_2
    iget-boolean v1, v9, Lbn;->c:Z

    if-eqz v1, :cond_4

    .line 225
    if-eqz v12, :cond_7

    move-object v1, v10

    .line 220
    :goto_2
    add-int/lit8 v7, v11, 0x1

    move v11, v7

    move-object v10, v1

    goto :goto_1

    .line 209
    :cond_3
    const/4 v1, 0x0

    move v12, v1

    goto :goto_0

    .line 231
    :cond_4
    iget-object v1, v9, Lbn;->a:Landroid/content/IntentFilter;

    const-string v7, "LocalBroadcastManager"

    invoke-virtual/range {v1 .. v7}, Landroid/content/IntentFilter;->match(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Set;Ljava/lang/String;)I

    move-result v1

    .line 233
    if-ltz v1, :cond_6

    .line 234
    if-eqz v12, :cond_5

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v14, "  Filter matched!  match=0x"

    invoke-direct {v7, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    :cond_5
    if-nez v10, :cond_c

    .line 237
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 239
    :goto_3
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    const/4 v7, 0x1

    iput-boolean v7, v9, Lbn;->c:Z

    goto :goto_2

    .line 267
    :catchall_0
    move-exception v1

    monitor-exit v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 242
    :cond_6
    if-eqz v12, :cond_7

    .line 244
    packed-switch v1, :pswitch_data_0

    .line 249
    :try_start_1
    const-string v1, "unknown reason"

    .line 251
    :goto_4
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v9, "  Filter did not match: "

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    move-object v1, v10

    goto :goto_2

    .line 245
    :pswitch_0
    const-string v1, "action"

    goto :goto_4

    .line 246
    :pswitch_1
    const-string v1, "category"

    goto :goto_4

    .line 247
    :pswitch_2
    const-string v1, "data"

    goto :goto_4

    .line 248
    :pswitch_3
    const-string v1, "type"

    goto :goto_4

    .line 256
    :cond_8
    if-eqz v10, :cond_b

    .line 257
    const/4 v1, 0x0

    move v2, v1

    :goto_5
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v2, v1, :cond_9

    .line 258
    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbn;

    const/4 v3, 0x0

    iput-boolean v3, v1, Lbn;->c:Z

    .line 257
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_5

    .line 260
    :cond_9
    iget-object v1, p0, Lbk;->d:Ljava/util/ArrayList;

    new-instance v2, Lbm;

    move-object/from16 v0, p1

    invoke-direct {v2, v0, v10}, Lbm;-><init>(Landroid/content/Intent;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    iget-object v1, p0, Lbk;->e:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v1

    if-nez v1, :cond_a

    .line 262
    iget-object v1, p0, Lbk;->e:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 264
    :cond_a
    const/4 v1, 0x1

    monitor-exit v13

    .line 268
    :goto_6
    return v1

    .line 267
    :cond_b
    monitor-exit v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 268
    const/4 v1, 0x0

    goto :goto_6

    :cond_c
    move-object v1, v10

    goto :goto_3

    .line 244
    nop

    :pswitch_data_0
    .packed-switch -0x4
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
