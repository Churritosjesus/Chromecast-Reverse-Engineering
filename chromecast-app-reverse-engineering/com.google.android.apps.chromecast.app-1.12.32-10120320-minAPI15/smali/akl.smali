.class public Lakl;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field final a:Lakg;

.field b:Ljava/util/Set;

.field final c:Lajy;

.field public final d:Ljava/lang/String;

.field final e:Ljava/lang/String;

.field public f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 518
    new-instance v0, Lakm;

    invoke-direct {v0}, Lakm;-><init>()V

    sput-object v0, Lakl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lakg;Ljava/util/Set;Lajy;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 440
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 433
    const/4 v0, 0x0

    iput-boolean v0, p0, Lakl;->f:Z

    .line 441
    iput-object p1, p0, Lakl;->a:Lakg;

    .line 442
    if-eqz p2, :cond_0

    :goto_0
    iput-object p2, p0, Lakl;->b:Ljava/util/Set;

    .line 443
    iput-object p3, p0, Lakl;->c:Lajy;

    .line 444
    iput-object p4, p0, Lakl;->d:Ljava/lang/String;

    .line 445
    iput-object p5, p0, Lakl;->e:Ljava/lang/String;

    .line 446
    return-void

    .line 442
    :cond_0
    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    goto :goto_0
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 490
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 433
    iput-boolean v2, p0, Lakl;->f:Z

    .line 491
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 492
    if-eqz v0, :cond_1

    invoke-static {v0}, Lakg;->valueOf(Ljava/lang/String;)Lakg;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lakl;->a:Lakg;

    .line 493
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 494
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    .line 495
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v3, p0, Lakl;->b:Ljava/util/Set;

    .line 496
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 497
    if-eqz v0, :cond_0

    invoke-static {v0}, Lajy;->valueOf(Ljava/lang/String;)Lajy;

    move-result-object v1

    :cond_0
    iput-object v1, p0, Lakl;->c:Lajy;

    .line 498
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lakl;->d:Ljava/lang/String;

    .line 499
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lakl;->e:Ljava/lang/String;

    .line 500
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Lakl;->f:Z

    .line 501
    return-void

    :cond_1
    move-object v0, v1

    .line 492
    goto :goto_0

    :cond_2
    move v0, v2

    .line 500
    goto :goto_1
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 505
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 510
    iget-object v0, p0, Lakl;->a:Lakg;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lakl;->a:Lakg;

    invoke-virtual {v0}, Lakg;->name()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 511
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lakl;->b:Ljava/util/Set;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 512
    iget-object v0, p0, Lakl;->c:Lajy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lakl;->c:Lajy;

    invoke-virtual {v0}, Lajy;->name()Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 513
    iget-object v0, p0, Lakl;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 514
    iget-object v0, p0, Lakl;->e:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 515
    iget-boolean v0, p0, Lakl;->f:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_1
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 516
    return-void

    :cond_1
    move-object v0, v1

    .line 510
    goto :goto_0

    .line 515
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method
