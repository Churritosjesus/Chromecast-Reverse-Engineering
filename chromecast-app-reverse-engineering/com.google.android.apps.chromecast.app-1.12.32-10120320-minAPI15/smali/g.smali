.class final Lg;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private a:[I

.field private b:I

.field private c:I

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:Ljava/lang/CharSequence;

.field private h:I

.field private i:Ljava/lang/CharSequence;

.field private j:Ljava/util/ArrayList;

.field private k:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 176
    new-instance v0, Lh;

    invoke-direct {v0}, Lh;-><init>()V

    sput-object v0, Lg;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lg;->a:[I

    .line 98
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lg;->b:I

    .line 99
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lg;->c:I

    .line 100
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lg;->d:Ljava/lang/String;

    .line 101
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lg;->e:I

    .line 102
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lg;->f:I

    .line 103
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Lg;->g:Ljava/lang/CharSequence;

    .line 104
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lg;->h:I

    .line 105
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Lg;->i:Ljava/lang/CharSequence;

    .line 106
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lg;->j:Ljava/util/ArrayList;

    .line 107
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lg;->k:Ljava/util/ArrayList;

    .line 108
    return-void
.end method

.method public constructor <init>(Lc;)V
    .locals 8

    .prologue
    const/4 v3, 0x0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iget-object v0, p1, Lc;->a:Lb;

    move-object v1, v0

    move v0, v3

    .line 54
    :goto_0
    if-eqz v1, :cond_1

    .line 55
    iget-object v2, v1, Lb;->i:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    iget-object v2, v1, Lb;->i:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/2addr v0, v2

    .line 56
    :cond_0
    iget-object v1, v1, Lb;->a:Lb;

    goto :goto_0

    .line 58
    :cond_1
    iget v1, p1, Lc;->b:I

    mul-int/lit8 v1, v1, 0x7

    add-int/2addr v0, v1

    new-array v0, v0, [I

    iput-object v0, p0, Lg;->a:[I

    .line 60
    iget-boolean v0, p1, Lc;->e:Z

    if-nez v0, :cond_2

    .line 61
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not on back stack"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 64
    :cond_2
    iget-object v0, p1, Lc;->a:Lb;

    move-object v5, v0

    move v0, v3

    .line 66
    :goto_1
    if-eqz v5, :cond_6

    .line 67
    iget-object v1, p0, Lg;->a:[I

    add-int/lit8 v2, v0, 0x1

    iget v4, v5, Lb;->c:I

    aput v4, v1, v0

    .line 68
    iget-object v1, p0, Lg;->a:[I

    add-int/lit8 v4, v2, 0x1

    iget-object v0, v5, Lb;->d:Lj;

    if-eqz v0, :cond_3

    iget-object v0, v5, Lb;->d:Lj;

    iget v0, v0, Lj;->k:I

    :goto_2
    aput v0, v1, v2

    .line 69
    iget-object v0, p0, Lg;->a:[I

    add-int/lit8 v1, v4, 0x1

    iget v2, v5, Lb;->e:I

    aput v2, v0, v4

    .line 70
    iget-object v0, p0, Lg;->a:[I

    add-int/lit8 v2, v1, 0x1

    iget v4, v5, Lb;->f:I

    aput v4, v0, v1

    .line 71
    iget-object v0, p0, Lg;->a:[I

    add-int/lit8 v1, v2, 0x1

    iget v4, v5, Lb;->g:I

    aput v4, v0, v2

    .line 72
    iget-object v0, p0, Lg;->a:[I

    add-int/lit8 v2, v1, 0x1

    iget v4, v5, Lb;->h:I

    aput v4, v0, v1

    .line 73
    iget-object v0, v5, Lb;->i:Ljava/util/ArrayList;

    if-eqz v0, :cond_5

    .line 74
    iget-object v0, v5, Lb;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 75
    iget-object v0, p0, Lg;->a:[I

    add-int/lit8 v1, v2, 0x1

    aput v6, v0, v2

    move v2, v3

    .line 76
    :goto_3
    if-ge v2, v6, :cond_4

    .line 77
    iget-object v7, p0, Lg;->a:[I

    add-int/lit8 v4, v1, 0x1

    iget-object v0, v5, Lb;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    iget v0, v0, Lj;->k:I

    aput v0, v7, v1

    .line 76
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    move v1, v4

    goto :goto_3

    .line 68
    :cond_3
    const/4 v0, -0x1

    goto :goto_2

    :cond_4
    move v0, v1

    .line 82
    :goto_4
    iget-object v1, v5, Lb;->a:Lb;

    move-object v5, v1

    goto :goto_1

    .line 80
    :cond_5
    iget-object v1, p0, Lg;->a:[I

    add-int/lit8 v0, v2, 0x1

    aput v3, v1, v2

    goto :goto_4

    .line 84
    :cond_6
    iget v0, p1, Lc;->c:I

    iput v0, p0, Lg;->b:I

    .line 85
    iget v0, p1, Lc;->d:I

    iput v0, p0, Lg;->c:I

    .line 86
    iget-object v0, p1, Lc;->f:Ljava/lang/String;

    iput-object v0, p0, Lg;->d:Ljava/lang/String;

    .line 87
    iget v0, p1, Lc;->g:I

    iput v0, p0, Lg;->e:I

    .line 88
    iget v0, p1, Lc;->h:I

    iput v0, p0, Lg;->f:I

    .line 89
    iget-object v0, p1, Lc;->i:Ljava/lang/CharSequence;

    iput-object v0, p0, Lg;->g:Ljava/lang/CharSequence;

    .line 90
    iget v0, p1, Lc;->j:I

    iput v0, p0, Lg;->h:I

    .line 91
    iget-object v0, p1, Lc;->k:Ljava/lang/CharSequence;

    iput-object v0, p0, Lg;->i:Ljava/lang/CharSequence;

    .line 92
    iget-object v0, p1, Lc;->l:Ljava/util/ArrayList;

    iput-object v0, p0, Lg;->j:Ljava/util/ArrayList;

    .line 93
    iget-object v0, p1, Lc;->m:Ljava/util/ArrayList;

    iput-object v0, p0, Lg;->k:Ljava/util/ArrayList;

    .line 94
    return-void
.end method


# virtual methods
.method public final a(Lt;)Lc;
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v1, 0x0

    .line 111
    new-instance v4, Lc;

    invoke-direct {v4, p1}, Lc;-><init>(Lt;)V

    move v0, v1

    .line 114
    :goto_0
    iget-object v2, p0, Lg;->a:[I

    array-length v2, v2

    if-ge v0, v2, :cond_2

    .line 115
    new-instance v5, Lb;

    invoke-direct {v5}, Lb;-><init>()V

    .line 116
    iget-object v2, p0, Lg;->a:[I

    add-int/lit8 v3, v0, 0x1

    aget v0, v2, v0

    iput v0, v5, Lb;->c:I

    .line 117
    sget-boolean v0, Lt;->a:Z

    .line 119
    iget-object v0, p0, Lg;->a:[I

    add-int/lit8 v2, v3, 0x1

    aget v0, v0, v3

    .line 120
    if-ltz v0, :cond_0

    .line 121
    iget-object v3, p1, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 122
    iput-object v0, v5, Lb;->d:Lj;

    .line 126
    :goto_1
    iget-object v0, p0, Lg;->a:[I

    add-int/lit8 v3, v2, 0x1

    aget v0, v0, v2

    iput v0, v5, Lb;->e:I

    .line 127
    iget-object v0, p0, Lg;->a:[I

    add-int/lit8 v2, v3, 0x1

    aget v0, v0, v3

    iput v0, v5, Lb;->f:I

    .line 128
    iget-object v0, p0, Lg;->a:[I

    add-int/lit8 v3, v2, 0x1

    aget v0, v0, v2

    iput v0, v5, Lb;->g:I

    .line 129
    iget-object v0, p0, Lg;->a:[I

    add-int/lit8 v2, v3, 0x1

    aget v0, v0, v3

    iput v0, v5, Lb;->h:I

    .line 130
    iget-object v3, p0, Lg;->a:[I

    add-int/lit8 v0, v2, 0x1

    aget v6, v3, v2

    .line 131
    if-lez v6, :cond_1

    .line 132
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, v5, Lb;->i:Ljava/util/ArrayList;

    move v2, v1

    .line 133
    :goto_2
    if-ge v2, v6, :cond_1

    .line 134
    sget-boolean v3, Lt;->a:Z

    .line 136
    iget-object v7, p1, Lt;->b:Ljava/util/ArrayList;

    iget-object v8, p0, Lg;->a:[I

    add-int/lit8 v3, v0, 0x1

    aget v0, v8, v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 137
    iget-object v7, v5, Lb;->i:Ljava/util/ArrayList;

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    move v0, v3

    goto :goto_2

    .line 124
    :cond_0
    const/4 v0, 0x0

    iput-object v0, v5, Lb;->d:Lj;

    goto :goto_1

    .line 140
    :cond_1
    invoke-virtual {v4, v5}, Lc;->a(Lb;)V

    goto :goto_0

    .line 143
    :cond_2
    iget v0, p0, Lg;->b:I

    iput v0, v4, Lc;->c:I

    .line 144
    iget v0, p0, Lg;->c:I

    iput v0, v4, Lc;->d:I

    .line 145
    iget-object v0, p0, Lg;->d:Ljava/lang/String;

    iput-object v0, v4, Lc;->f:Ljava/lang/String;

    .line 146
    iget v0, p0, Lg;->e:I

    iput v0, v4, Lc;->g:I

    .line 147
    iput-boolean v9, v4, Lc;->e:Z

    .line 148
    iget v0, p0, Lg;->f:I

    iput v0, v4, Lc;->h:I

    .line 149
    iget-object v0, p0, Lg;->g:Ljava/lang/CharSequence;

    iput-object v0, v4, Lc;->i:Ljava/lang/CharSequence;

    .line 150
    iget v0, p0, Lg;->h:I

    iput v0, v4, Lc;->j:I

    .line 151
    iget-object v0, p0, Lg;->i:Ljava/lang/CharSequence;

    iput-object v0, v4, Lc;->k:Ljava/lang/CharSequence;

    .line 152
    iget-object v0, p0, Lg;->j:Ljava/util/ArrayList;

    iput-object v0, v4, Lc;->l:Ljava/util/ArrayList;

    .line 153
    iget-object v0, p0, Lg;->k:Ljava/util/ArrayList;

    iput-object v0, v4, Lc;->m:Ljava/util/ArrayList;

    .line 154
    invoke-virtual {v4, v9}, Lc;->b(I)V

    .line 155
    return-object v4
.end method

.method public final describeContents()I
    .locals 1

    .prologue
    .line 159
    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 163
    iget-object v0, p0, Lg;->a:[I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 164
    iget v0, p0, Lg;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 165
    iget v0, p0, Lg;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 166
    iget-object v0, p0, Lg;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 167
    iget v0, p0, Lg;->e:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 168
    iget v0, p0, Lg;->f:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 169
    iget-object v0, p0, Lg;->g:Ljava/lang/CharSequence;

    invoke-static {v0, p1, v1}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 170
    iget v0, p0, Lg;->h:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 171
    iget-object v0, p0, Lg;->i:Ljava/lang/CharSequence;

    invoke-static {v0, p1, v1}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 172
    iget-object v0, p0, Lg;->j:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 173
    iget-object v0, p0, Lg;->k:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 174
    return-void
.end method
