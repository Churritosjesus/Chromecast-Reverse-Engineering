.class public final Ldcc;
.super Ldew;
.source "PG"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ldca;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/Integer;

.field public e:Ljava/lang/Integer;

.field public f:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 41
    invoke-direct {p0}, Ldew;-><init>()V

    .line 1046
    iput-object v0, p0, Ldcc;->a:Ljava/lang/String;

    .line 1047
    iput-object v0, p0, Ldcc;->b:Ldca;

    .line 1048
    iput-object v0, p0, Ldcc;->c:Ljava/lang/String;

    .line 1049
    iput-object v0, p0, Ldcc;->d:Ljava/lang/Integer;

    .line 1050
    iput-object v0, p0, Ldcc;->e:Ljava/lang/Integer;

    .line 1051
    iput-object v0, p0, Ldcc;->f:Ljava/lang/Integer;

    .line 1052
    const/4 v0, -0x1

    iput v0, p0, Ldcc;->t:I

    .line 43
    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 3

    .prologue
    .line 82
    invoke-super {p0}, Ldew;->a()I

    move-result v0

    .line 83
    iget-object v1, p0, Ldcc;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 84
    const/4 v1, 0x1

    iget-object v2, p0, Ldcc;->a:Ljava/lang/String;

    .line 85
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 87
    :cond_0
    iget-object v1, p0, Ldcc;->b:Ldca;

    if-eqz v1, :cond_1

    .line 88
    const/4 v1, 0x2

    iget-object v2, p0, Ldcc;->b:Ldca;

    .line 89
    invoke-static {v1, v2}, Ldep;->b(ILdew;)I

    move-result v1

    add-int/2addr v0, v1

    .line 91
    :cond_1
    iget-object v1, p0, Ldcc;->c:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 92
    const/4 v1, 0x3

    iget-object v2, p0, Ldcc;->c:Ljava/lang/String;

    .line 93
    invoke-static {v1, v2}, Ldep;->b(ILjava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    .line 95
    :cond_2
    iget-object v1, p0, Ldcc;->d:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    .line 96
    const/4 v1, 0x4

    iget-object v2, p0, Ldcc;->d:Ljava/lang/Integer;

    .line 97
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 99
    :cond_3
    iget-object v1, p0, Ldcc;->e:Ljava/lang/Integer;

    if-eqz v1, :cond_4

    .line 100
    const/4 v1, 0x5

    iget-object v2, p0, Ldcc;->e:Ljava/lang/Integer;

    .line 101
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 103
    :cond_4
    iget-object v1, p0, Ldcc;->f:Ljava/lang/Integer;

    if-eqz v1, :cond_5

    .line 104
    const/4 v1, 0x6

    iget-object v2, p0, Ldcc;->f:Ljava/lang/Integer;

    .line 105
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v1, v2}, Ldep;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 107
    :cond_5
    return v0
.end method

.method public final synthetic a(Ldeo;)Ldew;
    .locals 1

    .prologue
    .line 5
    .line 1115
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldeo;->a()I

    move-result v0

    .line 1116
    sparse-switch v0, :sswitch_data_0

    .line 1120
    invoke-static {p1, v0}, Ldey;->a(Ldeo;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1121
    :sswitch_0
    return-object p0

    .line 1126
    :sswitch_1
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldcc;->a:Ljava/lang/String;

    goto :goto_0

    .line 1130
    :sswitch_2
    iget-object v0, p0, Ldcc;->b:Ldca;

    if-nez v0, :cond_1

    .line 1131
    new-instance v0, Ldca;

    invoke-direct {v0}, Ldca;-><init>()V

    iput-object v0, p0, Ldcc;->b:Ldca;

    .line 1133
    :cond_1
    iget-object v0, p0, Ldcc;->b:Ldca;

    invoke-virtual {p1, v0}, Ldeo;->a(Ldew;)V

    goto :goto_0

    .line 1137
    :sswitch_3
    invoke-virtual {p1}, Ldeo;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ldcc;->c:Ljava/lang/String;

    goto :goto_0

    .line 1169
    :sswitch_4
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1141
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldcc;->d:Ljava/lang/Integer;

    goto :goto_0

    .line 2169
    :sswitch_5
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1145
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldcc;->e:Ljava/lang/Integer;

    goto :goto_0

    .line 3169
    :sswitch_6
    invoke-virtual {p1}, Ldeo;->e()I

    move-result v0

    .line 1149
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ldcc;->f:Ljava/lang/Integer;

    goto :goto_0

    .line 1116
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x12 -> :sswitch_2
        0x1a -> :sswitch_3
        0x20 -> :sswitch_4
        0x28 -> :sswitch_5
        0x30 -> :sswitch_6
    .end sparse-switch
.end method

.method public final a(Ldep;)V
    .locals 2

    .prologue
    .line 59
    iget-object v0, p0, Ldcc;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 60
    const/4 v0, 0x1

    iget-object v1, p0, Ldcc;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 62
    :cond_0
    iget-object v0, p0, Ldcc;->b:Ldca;

    if-eqz v0, :cond_1

    .line 63
    const/4 v0, 0x2

    iget-object v1, p0, Ldcc;->b:Ldca;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILdew;)V

    .line 65
    :cond_1
    iget-object v0, p0, Ldcc;->c:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 66
    const/4 v0, 0x3

    iget-object v1, p0, Ldcc;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ldep;->a(ILjava/lang/String;)V

    .line 68
    :cond_2
    iget-object v0, p0, Ldcc;->d:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    .line 69
    const/4 v0, 0x4

    iget-object v1, p0, Ldcc;->d:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 71
    :cond_3
    iget-object v0, p0, Ldcc;->e:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    .line 72
    const/4 v0, 0x5

    iget-object v1, p0, Ldcc;->e:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 74
    :cond_4
    iget-object v0, p0, Ldcc;->f:Ljava/lang/Integer;

    if-eqz v0, :cond_5

    .line 75
    const/4 v0, 0x6

    iget-object v1, p0, Ldcc;->f:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ldep;->a(II)V

    .line 77
    :cond_5
    invoke-super {p0, p1}, Ldew;->a(Ldep;)V

    .line 78
    return-void
.end method
