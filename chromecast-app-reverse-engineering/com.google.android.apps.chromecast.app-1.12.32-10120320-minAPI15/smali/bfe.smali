.class public final Lbfe;
.super Landroid/os/AsyncTask;
.source "PG"


# static fields
.field private static final b:[Ljava/lang/Object;


# instance fields
.field public a:Lbff;

.field private c:[Lbfd;

.field private d:Lbfd;

.field private final e:Lblp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    sput-object v0, Lbfe;->b:[Ljava/lang/Object;

    return-void
.end method

.method public varargs constructor <init>([Lbfd;)V
    .locals 3

    .prologue
    .line 55
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 56
    iput-object p1, p0, Lbfe;->c:[Lbfd;

    .line 57
    new-instance v0, Lblp;

    const-string v1, "NetworkTask"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lbfe;->e:Lblp;

    .line 58
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 71
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 76
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "executeOnExecutor"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    const-class v4, Ljava/util/concurrent/Executor;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-class v4, [Ljava/lang/Object;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 78
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    sget-object v3, Lbfe;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    sget-object v3, Lbfe;->b:[Ljava/lang/Object;

    aput-object v3, v1, v2

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    .line 92
    :goto_0
    return-void

    .line 80
    :catch_0
    move-exception v0

    .line 81
    iget-object v1, p0, Lbfe;->e:Lblp;

    const-string v2, "reflection failed"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2, v3}, Lblp;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    :cond_0
    :goto_1
    new-array v0, v5, [Ljava/lang/Void;

    invoke-super {p0, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 82
    :catch_1
    move-exception v0

    .line 83
    iget-object v1, p0, Lbfe;->e:Lblp;

    const-string v2, "reflection failed"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2, v3}, Lblp;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 84
    :catch_2
    move-exception v0

    .line 85
    iget-object v1, p0, Lbfe;->e:Lblp;

    const-string v2, "reflection failed"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2, v3}, Lblp;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 86
    :catch_3
    move-exception v0

    .line 87
    iget-object v1, p0, Lbfe;->e:Lblp;

    const-string v2, "reflection failed"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2, v3}, Lblp;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1
.end method

.method public final b()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 99
    iget-object v0, p0, Lbfe;->d:Lbfd;

    if-eqz v0, :cond_1

    .line 100
    iget-object v0, p0, Lbfe;->d:Lbfd;

    .line 1117
    iget-object v1, v0, Lbfd;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 1118
    const/4 v2, 0x1

    :try_start_0
    iput-boolean v2, v0, Lbfd;->f:Z

    .line 1119
    iget-object v2, v0, Lbfd;->d:Lbfq;

    if-eqz v2, :cond_0

    .line 1120
    iget-object v0, v0, Lbfd;->d:Lbfq;

    invoke-interface {v0}, Lbfq;->a()V

    .line 1122
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    :cond_1
    invoke-super {p0, v3}, Landroid/os/AsyncTask;->cancel(Z)Z

    .line 103
    return-void

    .line 1122
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 23
    .line 3117
    iget-object v2, p0, Lbfe;->c:[Lbfd;

    array-length v3, v2

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v0, v2, v1

    .line 3118
    invoke-virtual {p0}, Lbfe;->isCancelled()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 3119
    const/16 v0, -0x63

    .line 3129
    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Lbfe;->d:Lbfd;

    .line 3130
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 23
    return-object v0

    .line 3122
    :cond_1
    iput-object v0, p0, Lbfe;->d:Lbfd;

    .line 3123
    iget-object v0, p0, Lbfe;->d:Lbfd;

    invoke-virtual {v0}, Lbfd;->a()I

    move-result v0

    .line 3124
    if-nez v0, :cond_0

    .line 3117
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method protected final synthetic onCancelled(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 23
    .line 1154
    iget-object v0, p0, Lbfe;->a:Lbff;

    if-eqz v0, :cond_0

    .line 1155
    iget-object v0, p0, Lbfe;->a:Lbff;

    invoke-interface {v0}, Lbff;->b()V

    .line 23
    :cond_0
    return-void
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 23
    check-cast p1, Ljava/lang/Integer;

    .line 2135
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    .line 2136
    iget-object v0, p0, Lbfe;->a:Lbff;

    if-eqz v0, :cond_0

    .line 2137
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 2145
    iget-object v0, p0, Lbfe;->a:Lbff;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v1}, Lbff;->a(I)V

    .line 2143
    :cond_0
    :goto_0
    return-void

    .line 2139
    :sswitch_0
    iget-object v0, p0, Lbfe;->a:Lbff;

    invoke-interface {v0}, Lbff;->a()V

    goto :goto_0

    .line 2142
    :sswitch_1
    iget-object v0, p0, Lbfe;->a:Lbff;

    invoke-interface {v0}, Lbff;->b()V

    goto :goto_0

    .line 2137
    nop

    :sswitch_data_0
    .sparse-switch
        -0x63 -> :sswitch_1
        0x0 -> :sswitch_0
    .end sparse-switch
.end method
