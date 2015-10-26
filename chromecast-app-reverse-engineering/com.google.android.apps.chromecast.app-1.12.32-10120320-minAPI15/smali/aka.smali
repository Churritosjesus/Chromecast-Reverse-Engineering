.class final Laka;
.super Laky;
.source "PG"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private c:Lajz;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 185
    new-instance v0, Lakd;

    invoke-direct {v0}, Lakd;-><init>()V

    sput-object v0, Laka;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(Lakh;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1}, Laky;-><init>(Lakh;)V

    .line 46
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


# virtual methods
.method final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    const-string v0, "get_token"

    return-object v0
.end method

.method final a(Lakl;Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 83
    iget-object v0, p0, Laka;->c:Lajz;

    if-eqz v0, :cond_0

    .line 84
    iget-object v0, p0, Laka;->c:Lajz;

    .line 6068
    iput-object v1, v0, Lajd;->b:Lajf;

    .line 86
    :cond_0
    iput-object v1, p0, Laka;->c:Lajz;

    .line 88
    iget-object v0, p0, Laka;->b:Lakh;

    .line 6383
    iget-object v1, v0, Lakh;->e:Lakj;

    if-eqz v1, :cond_1

    .line 6384
    iget-object v0, v0, Lakh;->e:Lakj;

    invoke-interface {v0}, Lakj;->b()V

    .line 90
    :cond_1
    if-eqz p2, :cond_9

    .line 91
    const-string v0, "com.facebook.platform.extra.PERMISSIONS"

    .line 92
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 6449
    iget-object v0, p1, Lakl;->b:Ljava/util/Set;

    .line 94
    if-eqz v1, :cond_5

    if-eqz v0, :cond_2

    .line 95
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->containsAll(Ljava/util/Collection;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 7134
    :cond_2
    const-string v0, "com.facebook.platform.extra.USER_ID"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 7136
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 7137
    :cond_3
    iget-object v0, p0, Laka;->b:Lakh;

    invoke-virtual {v0}, Lakh;->f()V

    .line 7139
    const-string v0, "com.facebook.platform.extra.ACCESS_TOKEN"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 7140
    new-instance v1, Lakc;

    invoke-direct {v1, p0, p2, p1}, Lakc;-><init>(Laka;Landroid/os/Bundle;Lakl;)V

    invoke-static {v0, v1}, Laji;->a(Ljava/lang/String;Lajo;)V

    .line 7165
    :goto_0
    return-void

    .line 7166
    :cond_4
    invoke-virtual {p0, p1, p2}, Laka;->b(Lakl;Landroid/os/Bundle;)V

    goto :goto_0

    .line 103
    :cond_5
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 104
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 105
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 106
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 109
    :cond_7
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 110
    const-string v0, "new_permissions"

    const-string v1, ","

    .line 112
    invoke-static {v1, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    .line 110
    invoke-virtual {p0, v0, v1}, Laka;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 7453
    :cond_8
    const-string v0, "permissions"

    invoke-static {v2, v0}, Lajp;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7454
    iput-object v2, p1, Lakl;->b:Ljava/util/Set;

    .line 119
    :cond_9
    iget-object v0, p0, Laka;->b:Lakh;

    invoke-virtual {v0}, Lakh;->e()V

    goto :goto_0
.end method

.method final a(Lakl;)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 63
    new-instance v2, Lajz;

    iget-object v3, p0, Laka;->b:Lakh;

    .line 2094
    iget-object v3, v3, Lakh;->c:Lj;

    .line 2612
    iget-object v3, v3, Lj;->y:Lm;

    .line 3466
    iget-object v4, p1, Lakl;->d:Ljava/lang/String;

    .line 64
    invoke-direct {v2, v3, v4}, Lajz;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v2, p0, Laka;->c:Lajz;

    .line 65
    iget-object v2, p0, Laka;->c:Lajz;

    .line 4076
    iget-boolean v3, v2, Lajd;->c:Z

    if-eqz v3, :cond_0

    move v2, v0

    .line 65
    :goto_0
    if-nez v2, :cond_3

    .line 79
    :goto_1
    return v0

    .line 4081
    :cond_0
    iget v3, v2, Lajd;->e:I

    invoke-static {v3}, Laix;->a(I)I

    move-result v3

    .line 4083
    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    move v2, v0

    .line 4084
    goto :goto_0

    .line 4087
    :cond_1
    iget-object v3, v2, Lajd;->a:Landroid/content/Context;

    invoke-static {v3}, Laix;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v3

    .line 4088
    if-nez v3, :cond_2

    move v2, v0

    .line 4089
    goto :goto_0

    .line 4091
    :cond_2
    iput-boolean v1, v2, Lajd;->c:Z

    .line 4092
    iget-object v4, v2, Lajd;->a:Landroid/content/Context;

    invoke-virtual {v4, v3, v2, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move v2, v1

    .line 4093
    goto :goto_0

    .line 69
    :cond_3
    iget-object v0, p0, Laka;->b:Lakh;

    invoke-virtual {v0}, Lakh;->f()V

    .line 71
    new-instance v0, Lakb;

    invoke-direct {v0, p0, p1}, Lakb;-><init>(Laka;Lakl;)V

    .line 78
    iget-object v2, p0, Laka;->c:Lajz;

    .line 5068
    iput-object v0, v2, Lajd;->b:Lajf;

    move v0, v1

    .line 79
    goto :goto_1
.end method

.method final b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 55
    iget-object v0, p0, Laka;->c:Lajz;

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p0, Laka;->c:Lajz;

    .line 1098
    const/4 v1, 0x0

    iput-boolean v1, v0, Lajd;->c:Z

    .line 57
    iget-object v0, p0, Laka;->c:Lajz;

    .line 2068
    iput-object v2, v0, Lajd;->b:Lajf;

    .line 58
    iput-object v2, p0, Laka;->c:Lajz;

    .line 60
    :cond_0
    return-void
.end method

.method final b(Lakl;Landroid/os/Bundle;)V
    .locals 10

    .prologue
    const/4 v5, 0x0

    .line 123
    sget-object v6, Lafl;->b:Lafl;

    .line 7466
    iget-object v2, p1, Lakl;->d:Ljava/lang/String;

    .line 8111
    const-string v0, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH"

    new-instance v1, Ljava/util/Date;

    const-wide/16 v8, 0x0

    invoke-direct {v1, v8, v9}, Ljava/util/Date;-><init>(J)V

    invoke-static {p2, v0, v1}, Laji;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v7

    .line 8113
    const-string v0, "com.facebook.platform.extra.PERMISSIONS"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    .line 8114
    const-string v0, "com.facebook.platform.extra.ACCESS_TOKEN"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 8116
    invoke-static {v1}, Laji;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    :goto_0
    iget-object v0, p0, Laka;->b:Lakh;

    .line 9099
    iget-object v0, v0, Lakh;->f:Lakl;

    .line 128
    invoke-static {v0, v5}, Lakn;->a(Lakl;Lafb;)Lakn;

    move-result-object v0

    .line 129
    iget-object v1, p0, Laka;->b:Lakh;

    invoke-virtual {v1, v0}, Lakh;->a(Lakn;)V

    .line 130
    return-void

    .line 8120
    :cond_0
    const-string v0, "com.facebook.platform.extra.USER_ID"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 8122
    new-instance v0, Lafb;

    new-instance v8, Ljava/util/Date;

    invoke-direct {v8}, Ljava/util/Date;-><init>()V

    invoke-direct/range {v0 .. v8}, Lafb;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Lafl;Ljava/util/Date;Ljava/util/Date;)V

    move-object v5, v0

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
