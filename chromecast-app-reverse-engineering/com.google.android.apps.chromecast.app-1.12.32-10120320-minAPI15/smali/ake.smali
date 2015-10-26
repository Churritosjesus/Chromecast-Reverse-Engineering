.class final Lake;
.super Laky;
.source "PG"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 185
    new-instance v0, Lakf;

    invoke-direct {v0}, Lakf;-><init>()V

    sput-object v0, Lake;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lakh;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Laky;-><init>(Lakh;)V

    .line 42
    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .prologue
    .line 172
    invoke-direct {p0, p1}, Laky;-><init>(Landroid/os/Parcel;)V

    .line 173
    return-void
.end method

.method private a(Lakl;Landroid/content/Intent;)Lakn;
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 94
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 95
    invoke-static {v1}, Lake;->a(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v2

    .line 96
    const-string v3, "error_code"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 97
    invoke-static {v1}, Lake;->b(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v4

    .line 99
    const-string v5, "e2e"

    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 100
    invoke-static {v5}, Laji;->a(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 101
    invoke-virtual {p0, v5}, Lake;->a(Ljava/lang/String;)V

    .line 104
    :cond_0
    if-nez v2, :cond_2

    if-nez v3, :cond_2

    if-nez v4, :cond_2

    .line 5449
    :try_start_0
    iget-object v2, p1, Lakl;->b:Ljava/util/Set;

    .line 106
    sget-object v3, Lafl;->a:Lafl;

    .line 5466
    iget-object v4, p1, Lakl;->d:Ljava/lang/String;

    .line 106
    invoke-static {v2, v1, v3, v4}, Lake;->a(Ljava/util/Collection;Landroid/os/Bundle;Lafl;Ljava/lang/String;)Lafb;

    move-result-object v1

    .line 109
    invoke-static {p1, v1}, Lakn;->a(Lakl;Lafb;)Lakn;
    :try_end_0
    .catch Lafq; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 118
    :cond_1
    :goto_0
    return-object v0

    .line 110
    :catch_0
    move-exception v1

    .line 111
    invoke-virtual {v1}, Lafq;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lakn;->a(Lakl;Ljava/lang/String;Ljava/lang/String;)Lakn;

    move-result-object v0

    goto :goto_0

    .line 113
    :cond_2
    sget-object v1, Lajh;->a:Ljava/util/Collection;

    invoke-interface {v1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 115
    sget-object v1, Lajh;->b:Ljava/util/Collection;

    invoke-interface {v1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 116
    invoke-static {p1, v0}, Lakn;->a(Lakl;Ljava/lang/String;)Lakn;

    move-result-object v0

    goto :goto_0

    .line 118
    :cond_3
    invoke-static {p1, v2, v4, v3}, Lakn;->a(Lakl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lakn;

    move-result-object v0

    goto :goto_0
.end method

.method private static a(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 140
    const-string v0, "error"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 141
    if-nez v0, :cond_0

    .line 142
    const-string v0, "error_type"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 144
    :cond_0
    return-object v0
.end method

.method private a(Landroid/content/Intent;I)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 156
    if-nez p1, :cond_0

    .line 168
    :goto_0
    return v0

    .line 161
    :cond_0
    :try_start_0
    iget-object v1, p0, Lake;->b:Lakh;

    .line 6083
    iget-object v1, v1, Lakh;->c:Lj;

    .line 161
    invoke-virtual {v1, p1, p2}, Lj;->a(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    const/4 v0, 0x1

    goto :goto_0

    .line 165
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private static b(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 148
    const-string v0, "error_message"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 149
    if-nez v0, :cond_0

    .line 150
    const-string v0, "error_description"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 152
    :cond_0
    return-object v0
.end method


# virtual methods
.method final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    const-string v0, "katana_proxy_auth"

    return-object v0
.end method

.method final a(ILandroid/content/Intent;)Z
    .locals 5

    .prologue
    .line 71
    iget-object v0, p0, Lake;->b:Lakh;

    .line 5099
    iget-object v0, v0, Lakh;->f:Lakl;

    .line 73
    if-nez p2, :cond_0

    .line 75
    const-string v1, "Operation canceled"

    invoke-static {v0, v1}, Lakn;->a(Lakl;Ljava/lang/String;)Lakn;

    move-result-object v0

    .line 85
    :goto_0
    if-eqz v0, :cond_4

    .line 86
    iget-object v1, p0, Lake;->b:Lakh;

    invoke-virtual {v1, v0}, Lakh;->a(Lakn;)V

    .line 90
    :goto_1
    const/4 v0, 0x1

    return v0

    .line 76
    :cond_0
    if-nez p1, :cond_2

    .line 5123
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 5124
    invoke-static {v1}, Lake;->a(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v2

    .line 5125
    const-string v3, "error_code"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 5130
    const-string v4, "CONNECTION_FAILURE"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 5131
    invoke-static {v1}, Lake;->b(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v1

    .line 5133
    invoke-static {v0, v2, v1, v3}, Lakn;->a(Lakl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lakn;

    move-result-object v0

    goto :goto_0

    .line 5136
    :cond_1
    invoke-static {v0, v2}, Lakn;->a(Lakl;Ljava/lang/String;)Lakn;

    move-result-object v0

    goto :goto_0

    .line 78
    :cond_2
    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    .line 79
    const-string v1, "Unexpected resultCode from authorization."

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lakn;->a(Lakl;Ljava/lang/String;Ljava/lang/String;)Lakn;

    move-result-object v0

    goto :goto_0

    .line 82
    :cond_3
    invoke-direct {p0, v0, p2}, Lake;->a(Lakl;Landroid/content/Intent;)Lakn;

    move-result-object v0

    goto :goto_0

    .line 88
    :cond_4
    iget-object v0, p0, Lake;->b:Lakh;

    invoke-virtual {v0}, Lakh;->e()V

    goto :goto_1
.end method

.method final a(Lakl;)Z
    .locals 7

    .prologue
    .line 51
    invoke-static {}, Lakh;->g()Ljava/lang/String;

    move-result-object v3

    .line 52
    iget-object v0, p0, Lake;->b:Lakh;

    .line 1094
    iget-object v0, v0, Lakh;->c:Lj;

    .line 1612
    iget-object v0, v0, Lj;->y:Lm;

    .line 2466
    iget-object v1, p1, Lakl;->d:Ljava/lang/String;

    .line 3449
    iget-object v2, p1, Lakl;->b:Ljava/util/Set;

    .line 3474
    iget-boolean v4, p1, Lakl;->f:Z

    .line 3482
    iget-object v5, p1, Lakl;->b:Ljava/util/Set;

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 3483
    invoke-static {v5}, Laku;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 3484
    const/4 v5, 0x1

    .line 4462
    :goto_0
    iget-object v6, p1, Lakl;->c:Lajy;

    .line 52
    invoke-static/range {v0 .. v6}, Laix;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;ZZLajy;)Landroid/content/Intent;

    move-result-object v0

    .line 61
    const-string v1, "e2e"

    invoke-virtual {p0, v1, v3}, Lake;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    invoke-static {}, Lakh;->b()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lake;->a(Landroid/content/Intent;I)Z

    move-result v0

    return v0

    .line 3487
    :cond_1
    const/4 v5, 0x0

    goto :goto_0
.end method

.method public final describeContents()I
    .locals 1

    .prologue
    .line 177
    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 182
    invoke-super {p0, p1, p2}, Laky;->writeToParcel(Landroid/os/Parcel;I)V

    .line 183
    return-void
.end method
