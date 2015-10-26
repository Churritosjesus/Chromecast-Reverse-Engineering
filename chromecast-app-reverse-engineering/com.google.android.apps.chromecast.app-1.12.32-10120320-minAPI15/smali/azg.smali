.class public final Lazg;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Laph;

.field public c:Z

.field public d:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLaph;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lazg;->a:Ljava/lang/String;

    .line 45
    iput-boolean p2, p0, Lazg;->c:Z

    .line 46
    iput-object p3, p0, Lazg;->b:Laph;

    .line 47
    return-void
.end method

.method static synthetic a(Lazg;Lapd;I)V
    .locals 9

    .prologue
    const/16 v5, 0x19

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 22
    .line 4122
    invoke-static {}, Lape;->a()Lape;

    move-result-object v6

    .line 4123
    if-eqz p1, :cond_0

    .line 4124
    invoke-virtual {p1, p2}, Lapd;->a(I)Lapd;

    move-result-object v0

    invoke-virtual {v6, v0}, Lape;->a(Lapd;)V

    .line 4127
    :cond_0
    iget-object v0, p0, Lazg;->d:Ljava/util/HashMap;

    if-nez v0, :cond_2

    .line 4128
    iget-boolean v0, p0, Lazg;->c:Z

    if-eqz v0, :cond_1

    .line 4129
    new-instance v0, Lapd;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v5, v1}, Lapd;-><init>(ILjava/lang/Integer;)V

    iget-object v1, p0, Lazg;->b:Laph;

    .line 5115
    iput-object v1, v0, Lapd;->h:Laph;

    .line 4129
    invoke-virtual {v6, v0}, Lape;->a(Lapd;)V

    :cond_1
    :goto_0
    return-void

    .line 4134
    :cond_2
    iget-object v0, p0, Lazg;->d:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v1, v2

    :cond_3
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 4135
    const-string v4, "friendly_name"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v1, v3

    .line 4136
    goto :goto_1

    .line 4137
    :cond_4
    const-string v4, "timezone"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 4138
    new-instance v4, Lapd;

    iget-boolean v0, p0, Lazg;->c:Z

    if-eqz v0, :cond_5

    .line 4139
    const/16 v0, 0x1a

    .line 4140
    :goto_2
    invoke-direct {v4, v0}, Lapd;-><init>(I)V

    iget-object v0, p0, Lazg;->b:Laph;

    .line 6115
    iput-object v0, v4, Lapd;->h:Laph;

    .line 4138
    invoke-virtual {v6, v4}, Lape;->a(Lapd;)V

    goto :goto_1

    .line 4140
    :cond_5
    const/16 v0, 0x26

    goto :goto_2

    .line 4142
    :cond_6
    const-string v4, "locale"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 4143
    new-instance v4, Lapd;

    iget-boolean v0, p0, Lazg;->c:Z

    if-eqz v0, :cond_7

    .line 4144
    const/16 v0, 0x1b

    .line 4145
    :goto_3
    invoke-direct {v4, v0}, Lapd;-><init>(I)V

    iget-object v0, p0, Lazg;->b:Laph;

    .line 7115
    iput-object v0, v4, Lapd;->h:Laph;

    .line 4143
    invoke-virtual {v6, v4}, Lape;->a(Lapd;)V

    goto :goto_1

    .line 4145
    :cond_7
    const/16 v0, 0x27

    goto :goto_3

    .line 4147
    :cond_8
    const-string v4, "opt_in_opencast"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 4148
    new-instance v8, Lapd;

    iget-boolean v4, p0, Lazg;->c:Z

    if-eqz v4, :cond_9

    .line 4149
    const/16 v4, 0x6b

    .line 4150
    :goto_4
    invoke-direct {v8, v4}, Lapd;-><init>(I)V

    iget-object v4, p0, Lazg;->b:Laph;

    .line 8115
    iput-object v4, v8, Lapd;->h:Laph;

    .line 4151
    iget-object v4, p0, Lazg;->d:Ljava/util/HashMap;

    .line 4152
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_a

    move v0, v3

    :goto_5
    invoke-virtual {v8, v0}, Lapd;->a(I)Lapd;

    move-result-object v0

    .line 4148
    invoke-virtual {v6, v0}, Lape;->a(Lapd;)V

    goto :goto_1

    .line 4150
    :cond_9
    const/16 v4, 0x48

    goto :goto_4

    :cond_a
    move v0, v2

    .line 4152
    goto :goto_5

    .line 4153
    :cond_b
    const-string v4, "opt_in_stats"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 4154
    new-instance v8, Lapd;

    iget-boolean v4, p0, Lazg;->c:Z

    if-eqz v4, :cond_c

    .line 4155
    const/16 v4, 0x9a

    .line 4156
    :goto_6
    invoke-direct {v8, v4}, Lapd;-><init>(I)V

    iget-object v4, p0, Lazg;->b:Laph;

    .line 9115
    iput-object v4, v8, Lapd;->h:Laph;

    .line 4157
    iget-object v4, p0, Lazg;->d:Ljava/util/HashMap;

    .line 4158
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_d

    move v0, v3

    :goto_7
    invoke-virtual {v8, v0}, Lapd;->a(I)Lapd;

    move-result-object v0

    .line 4154
    invoke-virtual {v6, v0}, Lape;->a(Lapd;)V

    goto/16 :goto_1

    .line 4156
    :cond_c
    const/16 v4, 0x38

    goto :goto_6

    :cond_d
    move v0, v2

    .line 4158
    goto :goto_7

    .line 4161
    :cond_e
    new-instance v4, Lapd;

    iget-boolean v0, p0, Lazg;->c:Z

    if-eqz v0, :cond_f

    move v0, v5

    .line 4164
    :goto_8
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v4, v0, v1}, Lapd;-><init>(ILjava/lang/Integer;)V

    iget-object v0, p0, Lazg;->b:Laph;

    .line 10115
    iput-object v0, v4, Lapd;->h:Laph;

    .line 4161
    invoke-virtual {v6, v4}, Lape;->a(Lapd;)V

    .line 4166
    iget-boolean v0, p0, Lazg;->c:Z

    if-eqz v0, :cond_1

    if-ne p2, v3, :cond_1

    .line 4167
    new-instance v0, Lapd;

    const/16 v1, 0x93

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lapd;-><init>(ILjava/lang/Integer;)V

    iget-object v1, p0, Lazg;->b:Laph;

    .line 11115
    iput-object v1, v0, Lapd;->h:Laph;

    .line 4167
    invoke-virtual {v6, v0}, Lape;->a(Lapd;)V

    goto/16 :goto_0

    .line 4163
    :cond_f
    const/16 v0, 0x25

    goto :goto_8
.end method

.method private static a(Lbdf;)Z
    .locals 1

    .prologue
    .line 97
    invoke-static {p0}, Lbfl;->a(Lbdf;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1443
    iget-boolean v0, p0, Lbdf;->w:Z

    .line 97
    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 86
    iget-object v0, p0, Lazg;->d:Ljava/util/HashMap;

    const-string v1, "friendly_name"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method a(Lbdu;Lbdf;Lbdj;Lapd;Lbdn;)V
    .locals 2

    .prologue
    .line 204
    iget-object v0, p0, Lazg;->d:Ljava/util/HashMap;

    new-instance v1, Lazi;

    invoke-direct {v1, p0, p4, p5, p3}, Lazi;-><init>(Lazg;Lapd;Lbdn;Lbdj;)V

    invoke-virtual {p1, v0, p2, v1}, Lbdu;->a(Ljava/util/HashMap;Lbdf;Lbdn;)V

    .line 220
    return-void
.end method

.method public final a(Lbdu;Lbdf;Lbdn;)V
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 179
    .line 2106
    invoke-static {p2}, Lazg;->a(Lbdf;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object v4, v3

    .line 180
    :goto_0
    invoke-static {p2}, Lazg;->a(Lbdf;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 181
    new-instance v0, Lazh;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lazh;-><init>(Lazg;Lbdu;Lbdf;Lapd;Lbdn;)V

    .line 3538
    invoke-virtual {p1}, Lbdu;->d()J

    move-result-wide v2

    .line 3539
    new-instance v4, Lbfl;

    iget-object v1, p1, Lbdu;->d:Ljava/lang/String;

    invoke-direct {v4, v1}, Lbfl;-><init>(Ljava/lang/String;)V

    .line 3540
    const-string v1, "saveWifi"

    iget v5, p1, Lbdu;->e:I

    new-instance v6, Lbeg;

    invoke-direct {v6, p1, v0, v4}, Lbeg;-><init>(Lbdu;Lbdn;Lbfl;)V

    move-object v0, p1

    invoke-virtual/range {v0 .. v6}, Lbdu;->a(Ljava/lang/String;JLbfp;ILbff;)V

    .line 199
    :goto_1
    return-void

    .line 2109
    :cond_0
    new-instance v4, Lapd;

    .line 3063
    iget-boolean v0, p0, Lazg;->c:Z

    .line 2109
    if-eqz v0, :cond_1

    const/16 v0, 0x18

    .line 2110
    :goto_2
    invoke-direct {v4, v0}, Lapd;-><init>(I)V

    iget-object v0, p0, Lazg;->b:Laph;

    .line 3115
    iput-object v0, v4, Lapd;->h:Laph;

    goto :goto_0

    .line 2110
    :cond_1
    const/16 v0, 0x2e

    goto :goto_2

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    .line 197
    invoke-virtual/range {v0 .. v5}, Lazg;->a(Lbdu;Lbdf;Lbdj;Lapd;Lbdn;)V

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lazg;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    return-void
.end method
