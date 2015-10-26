.class public final Ldcm;
.super Ldew;
.source "PG"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/Long;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 38
    invoke-direct {p0}, Ldew;-><init>()V

    .line 1043
    iput-object v0, p0, Ldcm;->a:Ljava/lang/String;

    .line 1044
    iput-object v0, p0, Ldcm;->d:Ljava/lang/String;

    .line 1045
    iput-object v0, p0, Ldcm;->b:Ljava/lang/String;

    .line 1046
    iput-object v0, p0, Ldcm;->c:Ljava/lang/Long;

    .line 1047
    iput-object v0, p0, Ldcm;->e:Ljava/lang/String;

    .line 1048
    const/4 v0, -0x1

    iput v0, p0, Ldcm;->t:I

    .line 40
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 4

    .prologue
    .line 75
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 76
    iget-object v1, p0, Ldcm;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 77
    const/4 v1, 0x1

    iget-object v2, p0, Ldcm;->a:Ljava/lang/String;

    .line 78
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 80
    :cond_0
    iget-object v1, p0, Ldcm;->d:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 81
    const/4 v1, 0x2

    iget-object v2, p0, Ldcm;->d:Ljava/lang/String;

    .line 82
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 84
    :cond_1
    iget-object v1, p0, Ldcm;->b:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 85
    const/4 v1, 0x3

    iget-object v2, p0, Ldcm;->b:Ljava/lang/String;

    .line 86
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 88
    :cond_2
    iget-object v1, p0, Ldcm;->c:Ljava/lang/Long;

    if-eqz v1, :cond_3

    .line 89
    const/4 v1, 0x4

    iget-object v2, p0, Ldcm;->c:Ljava/lang/Long;

    .line 90
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Ldep;->b(IJ)I

    move-result v1

    add-int/2addr v0, v1

    .line 92
    :cond_3
    iget-object v1, p0, Ldcm;->e:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 93
    const/4 v1, 0x5

    iget-object v2, p0, Ldcm;->e:Ljava/lang/String;

    .line 94
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 96
    :cond_4
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 2

    .prologue
    .line 5
    .line 1104
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1105
    sparse-switch v0, :sswitch_data_0

    .line 1109
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1110
    :sswitch_0
    return-object p0

    .line 1115
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldcm;->a:Ljava/lang/String;

    goto :goto_0

    .line 1119
    :sswitch_2
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldcm;->d:Ljava/lang/String;

    goto :goto_0

    .line 1123
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldcm;->b:Ljava/lang/String;

    goto :goto_0

    .line 1127
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Ldcm;->c:Ljava/lang/Long;

    goto :goto_0

    .line 1131
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldcm;->e:Ljava/lang/String;

    goto :goto_0

    .line 1105
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x20 -> :sswitch_4
        0x2a -> :sswitch_5
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 4

    .prologue
    .line 55
    iget-object v0, p0, Ldcm;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 56
    const/4 v0, 0x1

    iget-object v1, p0, Ldcm;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 58
    :cond_0
    iget-object v0, p0, Ldcm;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 59
    const/4 v0, 0x2

    iget-object v1, p0, Ldcm;->d:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 61
    :cond_1
    iget-object v0, p0, Ldcm;->b:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 62
    const/4 v0, 0x3

    iget-object v1, p0, Ldcm;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 64
    :cond_2
    iget-object v0, p0, Ldcm;->c:Ljava/lang/Long;

    if-eqz v0, :cond_3

    .line 65
    const/4 v0, 0x4

    iget-object v1, p0, Ldcm;->c:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v0, v2, v3}, Ldep;->a(IJ)V

    .line 67
    :cond_3
    iget-object v0, p0, Ldcm;->e:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 68
    const/4 v0, 0x5

    iget-object v1, p0, Ldcm;->e:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 70
    :cond_4
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 71
    return-void
.end method
