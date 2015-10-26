.class public final Lbqk;
.super Ljava/lang/Object;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static volatile a:Lbpr;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 0
    new-instance v0, Lbsa;

    invoke-direct {v0}, Lbsa;-><init>()V

    .line 3000
    sput-object v0, Lbqk;->a:Lbpr;

    .line 0
    return-void
.end method

.method public static a()Lbpr;
    .locals 1

    sget-object v0, Lbqk;->a:Lbpr;

    return-object v0
.end method

.method public static a(Lbpr;)V
    .locals 0

    sput-object p0, Lbqk;->a:Lbpr;

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lbql;->b()Lbql;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, p0}, Lbql;->e(Ljava/lang/String;)V

    :cond_0
    :goto_0
    sget-object v0, Lbqk;->a:Lbpr;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lbpr;->a(Ljava/lang/String;)V

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x2

    invoke-static {v0}, Lbqk;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lbqd;->b:Lbqe;

    invoke-virtual {v0}, Lbqe;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lbql;->b()Lbql;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, p0, p1}, Lbql;->e(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    :goto_0
    sget-object v0, Lbqk;->a:Lbpr;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lbpr;->b(Ljava/lang/String;)V

    :cond_1
    return-void

    :cond_2
    const/4 v0, 0x3

    invoke-static {v0}, Lbqk;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    :goto_1
    sget-object v0, Lbqd;->b:Lbqe;

    invoke-virtual {v0}, Lbqe;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_3
    move-object v1, p0

    goto :goto_1
.end method

.method private static a(I)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1000
    sget-object v1, Lbqk;->a:Lbpr;

    .line 0
    if-eqz v1, :cond_0

    .line 2000
    sget-object v1, Lbqk;->a:Lbpr;

    .line 0
    invoke-interface {v1}, Lbpr;->a()I

    move-result v1

    if-gt v1, p0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method
