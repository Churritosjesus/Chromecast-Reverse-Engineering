.class public final Laiw;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final a:Ljava/util/HashMap;


# instance fields
.field private final b:Lags;

.field private final c:Ljava/lang/String;

.field private d:Ljava/lang/StringBuilder;

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 38
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Laiw;->a:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Lags;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const/4 v0, 0x3

    iput v0, p0, Laiw;->e:I

    .line 92
    const-string v0, "tag"

    invoke-static {p2, v0}, Lajp;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    iput-object p1, p0, Laiw;->b:Lags;

    .line 95
    const-string v0, "FacebookSDK."

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Laiw;->c:Ljava/lang/String;

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Laiw;->d:Ljava/lang/StringBuilder;

    .line 97
    return-void

    .line 95
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public static a(Lags;ILjava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 69
    invoke-static {p0}, Lafv;->a(Lags;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 70
    invoke-static {p3}, Laiw;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 71
    const-string v0, "FacebookSDK."

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 72
    const-string v0, "FacebookSDK."

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 74
    :goto_0
    invoke-static {p1, v0, v1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 78
    sget-object v0, Lags;->f:Lags;

    if-ne p0, v0, :cond_0

    .line 79
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 82
    :cond_0
    return-void

    .line 72
    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v0, p2

    goto :goto_0
.end method

.method public static a(Lags;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 58
    const/4 v0, 0x3

    invoke-static {p0, v0, p1, p2}, Laiw;->a(Lags;ILjava/lang/String;Ljava/lang/String;)V

    .line 59
    return-void
.end method

.method public static varargs a(Lags;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 62
    invoke-static {p0}, Lafv;->a(Lags;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 64
    const/4 v1, 0x3

    invoke-static {p0, v1, p1, v0}, Laiw;->a(Lags;ILjava/lang/String;Ljava/lang/String;)V

    .line 66
    :cond_0
    return-void
.end method

.method public static declared-synchronized a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 52
    const-class v1, Laiw;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lags;->b:Lags;

    invoke-static {v0}, Lafv;->a(Lags;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 53
    const-string v0, "ACCESS_TOKEN_REMOVED"

    invoke-static {p0, v0}, Laiw;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    :cond_0
    monitor-exit v1

    return-void

    .line 52
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static declared-synchronized a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 48
    const-class v1, Laiw;

    monitor-enter v1

    :try_start_0
    sget-object v0, Laiw;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    monitor-exit v1

    return-void

    .line 48
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static declared-synchronized c(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 85
    const-class v2, Laiw;

    monitor-enter v2

    :try_start_0
    sget-object v0, Laiw;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 86
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object p0

    goto :goto_0

    .line 88
    :cond_0
    monitor-exit v2

    return-object p0

    .line 85
    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 116
    iget-object v0, p0, Laiw;->d:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1122
    iget-object v1, p0, Laiw;->b:Lags;

    iget v2, p0, Laiw;->e:I

    iget-object v3, p0, Laiw;->c:Ljava/lang/String;

    invoke-static {v1, v2, v3, v0}, Laiw;->a(Lags;ILjava/lang/String;Ljava/lang/String;)V

    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Laiw;->d:Ljava/lang/StringBuilder;

    .line 118
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 144
    const-string v0, "  %s:\t%s\n"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    .line 2148
    iget-object v2, p0, Laiw;->b:Lags;

    invoke-static {v2}, Lafv;->a(Lags;)Z

    move-result v2

    .line 2138
    if-eqz v2, :cond_0

    .line 2139
    iget-object v2, p0, Laiw;->d:Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 132
    .line 1148
    iget-object v0, p0, Laiw;->b:Lags;

    invoke-static {v0}, Lafv;->a(Lags;)Z

    move-result v0

    .line 132
    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Laiw;->d:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    :cond_0
    return-void
.end method
