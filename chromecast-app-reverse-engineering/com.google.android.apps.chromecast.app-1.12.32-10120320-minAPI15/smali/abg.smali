.class public final Labg;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Labr;


# instance fields
.field final a:Landroid/content/ContentResolver;

.field final b:Leh;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;)V
    .locals 2

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Labg;->a:Landroid/content/ContentResolver;

    .line 60
    new-instance v0, Leh;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Leh;-><init>(I)V

    iput-object v0, p0, Labg;->b:Leh;

    .line 61
    return-void
.end method


# virtual methods
.method public final a(Lacx;Labs;)V
    .locals 3

    .prologue
    .line 65
    .line 1263
    iget-object v1, p1, Lacx;->j:Landroid/net/Uri;

    .line 66
    if-eqz v1, :cond_2

    .line 67
    iget-object v0, p0, Labg;->b:Leh;

    invoke-virtual {v0, v1}, Leh;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 68
    if-eqz v0, :cond_1

    .line 69
    invoke-virtual {p1, v0}, Lacx;->a([B)V

    .line 70
    if-eqz p2, :cond_0

    .line 71
    invoke-interface {p2}, Labs;->b()V

    .line 83
    :cond_0
    :goto_0
    return-void

    .line 2087
    :cond_1
    new-instance v0, Labh;

    invoke-direct {v0, p0, v1, p1, p2}, Labh;-><init>(Labg;Landroid/net/Uri;Lacx;Labs;)V

    .line 2143
    sget-object v1, Landroid/os/AsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 80
    :cond_2
    if-eqz p2, :cond_0

    .line 81
    invoke-interface {p2}, Labs;->d()V

    goto :goto_0
.end method
