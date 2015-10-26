.class public final Ldcb;
.super Ldew;
.source "PG"


# static fields
.field private static volatile a:[Ldcb;


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 29
    invoke-direct {p0}, Ldew;-><init>()V

    .line 1034
    iput-object v0, p0, Ldcb;->b:Ljava/lang/String;

    .line 1035
    iput-object v0, p0, Ldcb;->c:Ljava/lang/Long;

    .line 1036
    const/4 v0, -0x1

    iput v0, p0, Ldcb;->t:I

    .line 31
    return-void
.end method

.method public static b()[Ldcb;
    .locals 2

    .prologue
    .line 12
    sget-object v0, Ldcb;->a:[Ldcb;

    if-nez v0, :cond_1

    .line 13
    sget-object v1, Ldeu;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 15
    :try_start_0
    sget-object v0, Ldcb;->a:[Ldcb;

    if-nez v0, :cond_0

    .line 16
    const/4 v0, 0x0

    new-array v0, v0, [Ldcb;

    sput-object v0, Ldcb;->a:[Ldcb;

    .line 18
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    :cond_1
    sget-object v0, Ldcb;->a:[Ldcb;

    return-object v0

    .line 18
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method protected final a()I
    .locals 4

    .prologue
    .line 54
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 55
    iget-object v1, p0, Ldcb;->b:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 56
    const/4 v1, 0x1

    iget-object v2, p0, Ldcb;->b:Ljava/lang/String;

    .line 57
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 59
    :cond_0
    iget-object v1, p0, Ldcb;->c:Ljava/lang/Long;

    if-eqz v1, :cond_1

    .line 60
    const/4 v1, 0x2

    iget-object v2, p0, Ldcb;->c:Ljava/lang/Long;

    .line 61
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Ldep;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 63
    :cond_1
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 2

    .prologue
    .line 5
    .line 1071
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1072
    sparse-switch v0, :sswitch_data_0

    .line 1076
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1077
    :sswitch_0
    return-object p0

    .line 1082
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldcb;->b:Ljava/lang/String;

    goto :goto_0

    .line 1086
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ldcb;->c:Ljava/lang/Long;

    goto :goto_0

    .line 1072
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x10 -> :sswitch_2
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 4

    .prologue
    .line 43
    iget-object v0, p0, Ldcb;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 44
    const/4 v0, 0x1

    iget-object v1, p0, Ldcb;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 46
    :cond_0
    iget-object v0, p0, Ldcb;->c:Ljava/lang/Long;

    if-eqz v0, :cond_1

    .line 47
    const/4 v0, 0x2

    iget-object v1, p0, Ldcb;->c:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Ldep;->a(IJ)V

    .line 49
    :cond_1
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 50
    return-void
.end method
