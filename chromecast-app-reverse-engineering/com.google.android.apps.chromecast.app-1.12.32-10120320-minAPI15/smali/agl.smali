.class public Lagl;
.super Landroid/os/AsyncTask;
.source "PG"


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Ljava/lang/reflect/Method;


# instance fields
.field private final c:Ljava/net/HttpURLConnection;

.field private final d:Lagm;

.field private e:Ljava/lang/Exception;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 39
    const-class v0, Lagl;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lagl;->a:Ljava/lang/String;

    .line 48
    const-class v0, Landroid/os/AsyncTask;

    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    array-length v3, v2

    move v0, v1

    :goto_0
    if-ge v0, v3, :cond_0

    aget-object v4, v2, v0

    .line 49
    const-string v5, "executeOnExecutor"

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 50
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    .line 51
    array-length v6, v5

    const/4 v7, 0x2

    if-ne v6, v7, :cond_1

    aget-object v6, v5, v1

    const-class v7, Ljava/util/concurrent/Executor;

    if-ne v6, v7, :cond_1

    const/4 v6, 0x1

    aget-object v5, v5, v6

    .line 52
    invoke-virtual {v5}, Ljava/lang/Class;->isArray()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 53
    sput-object v4, Lagl;->b:Ljava/lang/reflect/Method;

    .line 58
    :cond_0
    return-void

    .line 48
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public constructor <init>(Lagm;)V
    .locals 1

    .prologue
    .line 87
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lagl;-><init>(Ljava/net/HttpURLConnection;Lagm;)V

    .line 88
    return-void
.end method

.method private constructor <init>(Ljava/net/HttpURLConnection;Lagm;)V
    .locals 1

    .prologue
    .line 125
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 126
    iput-object p2, p0, Lagl;->d:Lagm;

    .line 127
    const/4 v0, 0x0

    iput-object v0, p0, Lagl;->c:Ljava/net/HttpURLConnection;

    .line 128
    return-void
.end method

.method private varargs b()Ljava/util/List;
    .locals 2

    .prologue
    .line 175
    :try_start_0
    iget-object v0, p0, Lagl;->c:Ljava/net/HttpURLConnection;

    if-nez v0, :cond_0

    .line 176
    iget-object v0, p0, Lagl;->d:Lagm;

    .line 1252
    invoke-static {v0}, Laga;->a(Lagm;)Ljava/util/List;

    move-result-object v0

    .line 182
    :goto_0
    return-object v0

    .line 178
    :cond_0
    iget-object v0, p0, Lagl;->c:Ljava/net/HttpURLConnection;

    iget-object v1, p0, Lagl;->d:Lagm;

    invoke-static {v0, v1}, Laga;->a(Ljava/net/HttpURLConnection;Lagm;)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 180
    :catch_0
    move-exception v0

    .line 181
    iput-object v0, p0, Lagl;->e:Ljava/lang/Exception;

    .line 182
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method final a()Lagl;
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 187
    sget-object v0, Lagl;->b:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    .line 189
    :try_start_0
    sget-object v0, Lagl;->b:Ljava/lang/reflect/Method;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {}, Lafv;->d()Ljava/util/concurrent/Executor;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    aput-object v3, v1, v2

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 199
    :goto_0
    return-object p0

    .line 196
    :cond_0
    new-array v0, v1, [Ljava/lang/Void;

    invoke-virtual {p0, v0}, Lagl;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 194
    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0}, Lagl;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 38
    check-cast p1, Ljava/util/List;

    .line 2163
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 2165
    iget-object v0, p0, Lagl;->e:Ljava/lang/Exception;

    if-eqz v0, :cond_0

    .line 2166
    const-string v0, "onPostExecute: exception encountered during request: %s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lagl;->e:Ljava/lang/Exception;

    .line 2168
    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    .line 2166
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    :cond_0
    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .prologue
    .line 152
    invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V

    .line 154
    iget-object v0, p0, Lagl;->d:Lagm;

    .line 1156
    iget-object v0, v0, Lagm;->a:Landroid/os/Handler;

    .line 154
    if-nez v0, :cond_0

    .line 157
    iget-object v0, p0, Lagl;->d:Lagm;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 1160
    iput-object v1, v0, Lagm;->a:Landroid/os/Handler;

    .line 159
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 140
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{RequestAsyncTask: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    const-string v1, " connection: "

    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lagl;->c:Ljava/net/HttpURLConnection;

    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", requests: "

    .line 144
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lagl;->d:Lagm;

    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 147
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
