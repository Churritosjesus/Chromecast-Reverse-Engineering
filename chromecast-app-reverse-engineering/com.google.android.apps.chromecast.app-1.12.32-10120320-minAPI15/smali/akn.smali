.class public final Lakn;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field final a:Lakp;

.field final b:Lafb;

.field final c:Ljava/lang/String;

.field final d:Ljava/lang/String;

.field public e:Ljava/util/Map;

.field private f:Lakl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 621
    new-instance v0, Lako;

    invoke-direct {v0}, Lako;-><init>()V

    sput-object v0, Lakn;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Lakl;Lakp;Lafb;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 562
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 563
    const-string v0, "code"

    invoke-static {p2, v0}, Lajp;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 564
    iput-object p1, p0, Lakn;->f:Lakl;

    .line 565
    iput-object p3, p0, Lakn;->b:Lafb;

    .line 566
    iput-object p4, p0, Lakn;->c:Ljava/lang/String;

    .line 567
    iput-object p2, p0, Lakn;->a:Lakp;

    .line 568
    iput-object p5, p0, Lakn;->d:Ljava/lang/String;

    .line 569
    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 597
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 598
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lakp;->valueOf(Ljava/lang/String;)Lakp;

    move-result-object v0

    iput-object v0, p0, Lakn;->a:Lakp;

    .line 599
    const-class v0, Lafb;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lafb;

    iput-object v0, p0, Lakn;->b:Lafb;

    .line 600
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lakn;->c:Ljava/lang/String;

    .line 601
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lakn;->d:Ljava/lang/String;

    .line 602
    const-class v0, Lakl;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lakl;

    iput-object v0, p0, Lakn;->f:Lakl;

    .line 603
    invoke-static {p1}, Laji;->a(Landroid/os/Parcel;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lakn;->e:Ljava/util/Map;

    .line 604
    return-void
.end method

.method static a(Lakl;Lafb;)Lakn;
    .locals 6

    .prologue
    const/4 v4, 0x0

    .line 572
    new-instance v0, Lakn;

    sget-object v2, Lakp;->a:Lakp;

    move-object v1, p0

    move-object v3, p1

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lakn;-><init>(Lakl;Lakp;Lafb;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method static a(Lakl;Ljava/lang/String;)Lakn;
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 576
    new-instance v0, Lakn;

    sget-object v2, Lakp;->b:Lakp;

    move-object v1, p0

    move-object v4, p1

    move-object v5, v3

    invoke-direct/range {v0 .. v5}, Lakn;-><init>(Lakl;Lakp;Lafb;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method static a(Lakl;Ljava/lang/String;Ljava/lang/String;)Lakn;
    .locals 1

    .prologue
    .line 583
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lakn;->a(Lakl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lakn;

    move-result-object v0

    return-object v0
.end method

.method static a(Lakl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lakn;
    .locals 6

    .prologue
    .line 591
    const-string v0, ": "

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    .line 593
    invoke-static {v1}, Laji;->b([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 591
    invoke-static {v0, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v4

    .line 594
    new-instance v0, Lakn;

    sget-object v2, Lakp;->c:Lakp;

    const/4 v3, 0x0

    move-object v1, p0

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lakn;-><init>(Lakl;Lakp;Lafb;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    .prologue
    .line 608
    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 613
    iget-object v0, p0, Lakn;->a:Lakp;

    invoke-virtual {v0}, Lakp;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 614
    iget-object v0, p0, Lakn;->b:Lafb;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 615
    iget-object v0, p0, Lakn;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 616
    iget-object v0, p0, Lakn;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 617
    iget-object v0, p0, Lakn;->f:Lakl;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 618
    iget-object v0, p0, Lakn;->e:Ljava/util/Map;

    invoke-static {p1, v0}, Laji;->a(Landroid/os/Parcel;Ljava/util/Map;)V

    .line 619
    return-void
.end method
